/*
 * This file is generated by jOOQ.
*/
package top.bigwave.jooqdemo;


import javax.annotation.Generated;

import org.jooq.Identity;
import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;

import top.bigwave.jooqdemo.tables.Author;
import top.bigwave.jooqdemo.tables.records.AuthorRecord;


/**
 * A class modelling foreign key relationships and constraints of tables of 
 * the <code>library</code> schema.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.0"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // IDENTITY definitions
    // -------------------------------------------------------------------------

    public static final Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = Identities0.IDENTITY_AUTHOR;

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;

    // -------------------------------------------------------------------------
    // FOREIGN KEY definitions
    // -------------------------------------------------------------------------


    // -------------------------------------------------------------------------
    // [#1459] distribute members to avoid static initialisers > 64kb
    // -------------------------------------------------------------------------

    private static class Identities0 extends AbstractKeys {
        public static Identity<AuthorRecord, Integer> IDENTITY_AUTHOR = createIdentity(Author.AUTHOR, Author.AUTHOR.ID);
    }

    private static class UniqueKeys0 extends AbstractKeys {
        public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = createUniqueKey(Author.AUTHOR, "KEY_author_PRIMARY", Author.AUTHOR.ID);
    }
}
