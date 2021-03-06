package com.theprophet31337.prophecy.ast.nodewrapper;

import com.theprophet31337.prophecy.ast.ProphecyAstNode;
import com.theprophet31337.prophecy.ast.ProphecyAstNodeType;

public class AstCast
{
	private final int TYPE = 0;
	private final int EXPRESSION = 1;

	private ProphecyAstNode node;

	public AstCast(ProphecyAstNode node)
	{
		this.node = node;

		if (node.getType() != ProphecyAstNodeType.CAST)
			throw new IllegalArgumentException("node must be a CAST node");
	}

	public ProphecyAstNode getTypeNode()
	{
		return node.getChild(TYPE);
	}

	public ProphecyAstNode getExpressionNode()
	{
		return node.getChild(EXPRESSION);
	}
}
