//Program to demonstrate Database MetaData and ResultSet Metadata
package com.tnsif.einstien.daytwentyfour.client;

import com.tnsif.einstien.daytwentyfour.metadata.DBMetadata;

public class MetaDataDemo {

	public static void main(String[] args) {
		DBMetadata.showDatabaseMetataData();
		DBMetadata.showRSMetadata();

	}

}
