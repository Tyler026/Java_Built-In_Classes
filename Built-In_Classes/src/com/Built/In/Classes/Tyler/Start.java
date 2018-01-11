package com.Built.In.Classes.Tyler;

public class Start {

	public static void main(String[] args) {
		// --- Array --- \\
		String songs[] = {"Rock With You", "Smooth Criminal", "Wanna Be Startin' Something", "Thriller", "Beat It"};
		
		// --- StringBuilder Class --- \\
		StringBuilder sb = new StringBuilder(); {
		
		// Loop through all of the city names \\
		for (int index = 0; index < songs.length; index++) {
		
		// Use the .append() method to append the data sequentially \\
			sb.append(songs[index]);
		
		// Now we need to Concatenate the comma between Strings \\
			sb.append(", ");
		}
		}
		System.out.println(sb);
}
}