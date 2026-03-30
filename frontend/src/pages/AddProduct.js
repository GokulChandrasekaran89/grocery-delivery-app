import { useState } from "react";
import { productAPI } from "../api/api";
import { useNavigate } from "react-router-dom";

function AddProduct() {
  const [form, setForm] = useState({
    name: "",
    price: "",
    stock: ""
  });

  const navigate = useNavigate();

  const submit = async () => {
    await productAPI.post("/products", form);
    alert("Product Added!");
    navigate("/");
  };

  return (
    <div style={{ padding: "20px" }}>
      <h2>Add Product</h2>

      <input placeholder="Name"
        onChange={(e) => setForm({ ...form, name: e.target.value })}
      /><br />

      <input type="number" placeholder="Price"
        onChange={(e) => setForm({ ...form, price: e.target.value })}
      /><br />

      <input type="number" placeholder="Stock"
        onChange={(e) => setForm({ ...form, stock: e.target.value })}
      /><br /><br />

      <button onClick={submit}>Submit</button>
    </div>
  );
}

export default AddProduct;