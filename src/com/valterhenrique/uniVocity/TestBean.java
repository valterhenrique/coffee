package com.valterhenrique.uniVocity;

import com.univocity.parsers.annotations.*;

import java.math.BigDecimal;

public class TestBean {

    // if the value parsed in the quantity column is "?" or "-", it will be replaced by null.
    @NullString(nulls = { "?", "-" })
    // if a value resolves to null, it will be converted to the String "0".
    @Parsed(defaultNullRead = "0")
    private Integer quantity;   // The attribute type defines which conversion will be executed when processing the value.

    @Trim
    @LowerCase
    // the value for the comments attribute is in the column at index 4 (0 is the first column, so this means fifth column in the file)
    @Parsed(index = 4)
    private String comments;

    // you can also explicitly give the name of a column in the file.
    @Parsed(field = "amount")
    private BigDecimal amount;

    @Trim
    @LowerCase
    // values "no", "n" and "null" will be converted to false; values "yes" and "y" will be converted to true
    @BooleanString(falseStrings = { "no", "n", "null" }, trueStrings = { "yes", "y" })
    @Parsed
    private Boolean pending;
}