# LeetCode Java Repository Instructions

## Project Overview
This is a **LeetCode algorithm practice repository** containing clean, well-documented Java solutions. Each file represents a single problem with full solution code and explanatory comments.

## File Naming Convention
- **Format**: `{problem_number}_{problem_name}.java` (e.g., `001_twoSums.java`, `509_fibonacci_dp.java`)
- **Pattern suffix**: Add suffix to indicate approach (e.g., `_dp` for dynamic programming, `_2dp` for 2D DP)
- Start with leading zeros for problems < 1000 (e.g., `001_`, `062_`)

## Code Structure Pattern
Each Java file follows this structure:
```java
import [required_packages];

class Solution {
    public [returnType] [methodName]([parameters]) {
        // Clear, numbered comments explaining the algorithm
        // Each significant step has inline documentation
        // Example: "// Ways to reach step i = ways to reach (i-1) + ways to reach (i-2)"
        
        // Implementation with minimal complexity
    }
}
```

## Key Patterns

### Dynamic Programming Solutions
- Use `int[]` or `int[][]` arrays to store computed results
- Always initialize base cases explicitly (dp[0], dp[1], etc.)
- Include comments explaining the recurrence relation
- **Example**: `509_fibonacci_dp.java` shows: `dp[i] = dp[i-1] + dp[i-2]` with clear explanation

### Data Structure Usage
- **HashMap**: Used for efficient lookups (see `001_twoSums.java` - complement lookup pattern)
- Prefer standard Java collections (`java.util`)

### Comment Style
- Inline comments for each logic block explaining "why" not just "what"
- Use the pattern: `// [What we're doing] = [the logic/formula]`
- Example: `// If the complement exists in our map, we found the pair`

## Development Guidelines

### When Adding New Solutions
1. Use the file naming convention: `{problem_number}_{problem_name}_{approach}.java`
2. Wrap logic in a `Solution` class with the LeetCode-standard method signature
3. Add detailed comments for non-obvious algorithmic steps
4. For DP solutions, explicitly show base cases and recurrence relations
5. Include space/time complexity implications in comments where relevant

### Testing Approach
- Code should compile and run standalone (single `Solution` class)
- Focus on correctness for test cases defined in problem constraints
- No unit test files—solutions are tested against LeetCode constraints

## Project Specifics
- **Language**: Java (standard LeetCode format)
- **Focus**: Algorithms, especially dynamic programming and data structures
- **Scope**: Individual problem solutions, not a framework or library
- No external build system; files compile independently

## References
- See `README.md` for project description
- Each file is self-contained with complete explanation
