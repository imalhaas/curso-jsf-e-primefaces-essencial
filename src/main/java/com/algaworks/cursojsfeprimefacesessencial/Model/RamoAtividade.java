package com.algaworks.cursojsfeprimefacesessencial.Model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "ramo_atividade")
public class RamoAtividade implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RamoAtividade)) return false;
        RamoAtividade that = (RamoAtividade) o;
        return getId().equals(that.getId()) && getDescricao().equals(that.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getDescricao());
    }

    @Override
    public String toString() {
        return "RamoAtividade{" +
                "id=" + id + "]";
    }
}
