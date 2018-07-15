
package jasmin;

/**
 * This subclass of token represents symbols that need to maintain one
 * number value as an attribute.  It maintains that value in the public
 * field var_val.
 *
 * @author Jon Meyer
 * @version last updated: 1/7/96
 * @see java_cup.runtime.str_token
 */

class var_token extends java_cup.runtime.token {

  /**
   * Full constructor.
   */
  public var_token(int term_num, Number v) {
    /* super class does most of the work */
    super(term_num);

    var_val = v;
  }

  public var_token(int term_num, String v) {
    /* super class does most of the work */
    super(term_num);

    var_val = v;
  }

  /**
   * Constructor with default value of 0
   */
  public var_token(int term_num) {
    this(term_num, 0);
  }

  /**
   * The stored number reference.
   */
  public Object var_val;
};
