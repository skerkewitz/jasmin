
package jasmin.parser_;

/** This subclass of token represents numbers beginning with '+' or '-'
 *
 * @see java_cup.runtime.str_token
 * @version last updated: 26/10/05
 * @author  Jon Meyer
 */

public class relative_num_token extends java_cup.runtime.int_token {
    public relative_num_token(int term_num, int v) {
        super(term_num, v);
    }
}
