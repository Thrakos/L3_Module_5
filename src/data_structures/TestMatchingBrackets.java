package data_structures;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Stack;

import org.junit.Test;

public class TestMatchingBrackets {

	@Test
	public void testMatchingBrackets() {
		assertTrue(doBracketsMatch("{}"));
		assertTrue(doBracketsMatch("{{}}"));
		assertTrue(doBracketsMatch("{}{}{{}}"));
		assertTrue(doBracketsMatch("{{{{{}{{{{{}{{{}{}}}}{}{}{{}}}}{}}}{}{}{{}{}}{{{}{}{}}}{}{}{}}}}{{}}{}{{{{{{}}{}}}}}"));
		assertFalse(doBracketsMatch("{{}"));
		assertFalse(doBracketsMatch("}{"));
	}

	// USE A STACK TO COMPLETE THE METHOD FOR CHECKING IF EVERY OPENING BRACKET HAS A MATCHING CLOSING BRACKET
	// OK I WILL
	private boolean doBracketsMatch(String b) {
		
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = 0; i < b.length(); i++) {
			if (b.charAt(i) == '}') {
				if (!stack.isEmpty()) {
					stack.pop();
				} else {
					return false;
				}
			} else {
				stack.push(b.charAt(i));
			}
		}
		
		if (stack.isEmpty()) {
			return true;
		} else {
			return false;
		}
	}

}
