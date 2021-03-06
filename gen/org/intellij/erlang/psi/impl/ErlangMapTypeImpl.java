// This is a generated file. Not intended for manual editing.
package org.intellij.erlang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.intellij.erlang.ErlangTypes.*;
import org.intellij.erlang.psi.*;

public class ErlangMapTypeImpl extends ErlangTypeImpl implements ErlangMapType {

  public ErlangMapTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ErlangVisitor) ((ErlangVisitor)visitor).visitMapType(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<ErlangMapEntryType> getMapEntryTypeList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, ErlangMapEntryType.class);
  }

  @Override
  @Nullable
  public PsiElement getCurlyLeft() {
    return findChildByType(ERL_CURLY_LEFT);
  }

  @Override
  @Nullable
  public PsiElement getCurlyRight() {
    return findChildByType(ERL_CURLY_RIGHT);
  }

  @Override
  @NotNull
  public PsiElement getRadix() {
    return findNotNullChildByType(ERL_RADIX);
  }

}
