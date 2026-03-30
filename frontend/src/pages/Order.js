import { useState } from "react";
import { orderAPI } from "../api/api";
import { useLocation, useNavigate } from "react-router-dom";

function Order() {
  const [qty, setQty] = useState(1);
  const navigate = useNavigate();

  const query = new URLSearchParams(useLocation().search);
  const productId = query.get("productId");

  const placeOrder = async () => {
    try {
      await orderAPI.post("/orders", {
        productId: productId,
        quantity: qty
      });

      alert("✅ Order Placed!");
      navigate("/");
    } catch (err) {
      alert("❌ " + err.response.data);
    }
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Place Order</h2>

      <input
        type="number"
        value={qty}
        onChange={(e) => setQty(e.target.value)}
      /><br /><br />

      <button onClick={placeOrder}>Confirm Order</button>
    </div>
  );
}

export default Order;