import { useEffect, useState } from "react";
import { productAPI } from "../api/api";
import { Link } from "react-router-dom";
import "../App.css";

function Home() {
  const [products, setProducts] = useState([]);

  useEffect(() => {
    productAPI.get("/products")
      .then(res => setProducts(res.data))
      .catch(err => console.log(err));
  }, []);

  return (
    <div className="container">
      <div className="header">🛒 Grocery Store</div>

      <Link className="link" to="/add">➕ Add Product</Link>

      {products.length === 0 ? (
        <p>No products available</p>
      ) : (
        products.map(p => (
          <div className="card" key={p.id}>
            <h3>{p.name}</h3>
            <p>💰 Price: ₹{p.price}</p>
            <p>📦 Stock: {p.stock}</p>

            <Link className="link" to={`/order?productId=${p.id}`}>
              🛒 Order Now
            </Link>
          </div>
        ))
      )}
    </div>
  );
}

export default Home;