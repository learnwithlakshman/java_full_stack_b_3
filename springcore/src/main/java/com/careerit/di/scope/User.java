package com.careerit.di.scope;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class User {

		private String username;
		private String password;
}
