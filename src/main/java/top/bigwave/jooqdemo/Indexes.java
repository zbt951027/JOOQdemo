/*
 * This file is generated by jOOQ.
*/
package top.bigwave.jooqdemo;


import javax.annotation.Generated;

import org.jooq.Index;
import org.jooq.OrderField;
import org.jooq.impl.AbstractKeys;

import top.bigwave.jooqdemo.tables.Author;


/**
 * A class modelling indexes of tables of the <code>library</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes {

    // -------------------------------------------------------------------------
    // INDEX definitions
    // -------------------------------------------------------------------------

    public static final Index AUTHOR_PRIMARY = Indexes0.AUTHOR_PRIMARY;

    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Indexes0 extends AbstractKeys {
        public static Index AUTHOR_PRIMARY = createIndex("PRIMARY", Author.AUTHOR, new OrderField[] { Author.AUTHOR.ID }, true);
    }
}
