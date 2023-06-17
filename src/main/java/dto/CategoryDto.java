package dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rafaa.inventoryManagement.model.Category;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryDto {

	  private Integer id;

	  private String code;

	  private String designation;

	  private Integer idEntreprise;

	  @JsonIgnore
	  private List<ArticleDto> articles;
	  
}

