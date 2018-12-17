package telran.ashkelon2018.forum.domain;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = { "id" })
@Document(collection = "roles")
public class Role {
	String id;
	String roleName;
	public Role(String roleName) {
		this.roleName = roleName;
	}
}
