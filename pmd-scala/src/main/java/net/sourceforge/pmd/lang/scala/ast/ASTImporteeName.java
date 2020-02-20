/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.scala.ast;

import scala.meta.Importee;

/**
 * The ASTImporteeName node implementation.
 */
public class ASTImporteeName extends AbstractScalaNode<Importee.Name> {

    /**
     * Create the AST node for this Scala node.
     *
     * @param scalaNode
     *            the underlying Scala node
     */
    public ASTImporteeName(Importee.Name scalaNode) {
        super(scalaNode);
    }

    @Override
    public <D, R> R accept(ScalaParserVisitor<D, R> visitor, D data) {
        return visitor.visit(this, data);
    }
}