package dao;

import java.util.List;

import dto.Proveedor;

public interface ProveedorDao {
	public void insert(Proveedor proveedor);
    public void update(Proveedor proveedor);
    public void delete(Integer id);
    public Proveedor read(Integer id);
	public List<Proveedor> findListById(Integer id);
}
