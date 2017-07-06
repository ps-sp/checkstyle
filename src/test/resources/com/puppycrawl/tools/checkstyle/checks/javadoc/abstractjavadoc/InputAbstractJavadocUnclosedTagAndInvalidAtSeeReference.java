package com.puppycrawl.tools.checkstyle.checks.javadoc.abstractjavadoc;

/**
 * <unclosedTag>
 */
class InputAbstractJavadocUnclosedTagAndInvalidAtSeeReference {
    /**
     * @see "javax.swing.tree.DefaultTreeCellRenderer.getTreeCellRendererComponent()"error
     */
    void invalidAtSeeReference() {
    }
}
