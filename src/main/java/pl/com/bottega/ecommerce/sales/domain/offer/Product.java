package pl.com.bottega.ecommerce.sales.domain.offer;

import java.util.Date;

public class Product {

	private String id;

	private String name;

	private Date snapshotDate;

	private String type;

	private Money price;

	public Product(String id, String name, Date snapshotDate, String type, Money price) {
		this.id = id;
		this.name = name;
		this.snapshotDate = snapshotDate;
		this.type = type;
		this.price = price;
	}

	public String getId() {
		return id;
	}

	public Money getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}

	public Date getSnapshotDate() {
		return snapshotDate;
	}

	public String getType() {
		return type;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (name == null ? 0 : name.hashCode());
		result = prime * result + (price == null ? 0 : price.hashCode());
		result = prime * result + (id == null ? 0 : id.hashCode());
		result = prime * result + (type == null ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Product other = (Product) obj;

		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (price == null) {
			if (other.price != null) {
				return false;
			}
		} else if (!price.equals(other.price)) {
			return false;
		}
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (type != other.type) {
			return false;
		}

		return true;
	}

}
