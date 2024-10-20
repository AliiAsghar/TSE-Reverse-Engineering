package defpackage;

import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekz {
    public final dym a;
    private eks b;
    private final boolean c;
    private final int[] d;
    private final euu e;

    public ekz(euu euuVar, dym dymVar, eks eksVar, boolean z, int[] iArr, Set set) {
        this.a = dymVar;
        this.e = euuVar;
        this.b = eksVar;
        this.c = z;
        this.d = iArr;
        if (!set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                int[] iArr2 = (int[]) it.next();
                String str = new String(iArr2, 0, iArr2.length);
                a(str, 0, str.length(), 1, true, new ekx(str));
            }
        }
    }

    public static boolean b(Editable editable, KeyEvent keyEvent, boolean z) {
        ela[] elaVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (!e(selectionStart, selectionEnd) && (elaVarArr = (ela[]) editable.getSpans(selectionStart, selectionEnd, ela.class)) != null && (elaVarArr.length) > 0) {
                for (ela elaVar : elaVarArr) {
                    int spanStart = editable.getSpanStart(elaVar);
                    int spanEnd = editable.getSpanEnd(elaVar);
                    if (z) {
                        if (spanStart == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart && selectionStart < spanEnd) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                    } else {
                        if (spanEnd == selectionStart) {
                            editable.delete(spanStart, spanEnd);
                            return true;
                        }
                        if (selectionStart <= spanStart) {
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        if (r8 != (-1)) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean c(android.view.inputmethod.InputConnection r5, android.text.Editable r6, int r7, int r8, boolean r9) {
        /*
            r0 = 0
            if (r6 == 0) goto L79
            if (r7 < 0) goto L79
            if (r8 >= 0) goto L9
            goto L79
        L9:
            int r1 = android.text.Selection.getSelectionStart(r6)
            int r2 = android.text.Selection.getSelectionEnd(r6)
            boolean r3 = e(r1, r2)
            if (r3 != 0) goto L79
            if (r9 == 0) goto L2f
            int r7 = java.lang.Math.max(r7, r0)
            int r7 = defpackage.d.u(r6, r1, r7)
            int r8 = java.lang.Math.max(r8, r0)
            int r8 = defpackage.d.v(r6, r2, r8)
            r9 = -1
            if (r7 == r9) goto L79
            if (r8 == r9) goto L79
            goto L3d
        L2f:
            int r1 = r1 - r7
            int r7 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r8
            int r8 = r6.length()
            int r8 = java.lang.Math.min(r2, r8)
        L3d:
            java.lang.Class<ela> r9 = defpackage.ela.class
            java.lang.Object[] r9 = r6.getSpans(r7, r8, r9)
            ela[] r9 = (defpackage.ela[]) r9
            if (r9 == 0) goto L79
            int r1 = r9.length
            if (r1 <= 0) goto L79
            r2 = r0
        L4b:
            if (r2 >= r1) goto L62
            r3 = r9[r2]
            int r4 = r6.getSpanStart(r3)
            int r3 = r6.getSpanEnd(r3)
            int r7 = java.lang.Math.min(r4, r7)
            int r8 = java.lang.Math.max(r3, r8)
            int r2 = r2 + 1
            goto L4b
        L62:
            int r7 = java.lang.Math.max(r7, r0)
            int r9 = r6.length()
            int r8 = java.lang.Math.min(r8, r9)
            r5.beginBatchEdit()
            r6.delete(r7, r8)
            r5.endBatchEdit()
            r5 = 1
            return r5
        L79:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekz.c(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    private final boolean d(CharSequence charSequence, int i, int i2, elg elgVar) {
        int i3;
        if (elgVar.c() == 0) {
            eks eksVar = this.b;
            fjl f = elgVar.f();
            int x = f.x(8);
            if (x != 0) {
                ((ByteBuffer) f.c).getShort(x + f.b);
            }
            if (ekp.a.get() == null) {
                ekp.a.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) ekp.a.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = ((ekp) eksVar).b;
            String sb2 = sb.toString();
            int i4 = ear.a;
            boolean hasGlyph = textPaint.hasGlyph(sb2);
            int i5 = elgVar.b & 4;
            if (hasGlyph) {
                i3 = i5 | 2;
            } else {
                i3 = i5 | 1;
            }
            elgVar.b = i3;
        }
        if (elgVar.c() != 2) {
            return false;
        }
        return true;
    }

    private static boolean e(int i, int i2) {
        if (i != -1 && i2 != -1 && i == i2) {
            return false;
        }
        return true;
    }

    public final Object a(CharSequence charSequence, int i, int i2, int i3, boolean z, ekv ekvVar) {
        int i4;
        char c;
        eky ekyVar = new eky((fcp) this.e.a, this.c, this.d);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z2 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z2) {
                fcp c2 = ekyVar.d.c(codePointAt);
                if (ekyVar.a != 2) {
                    if (c2 == null) {
                        ekyVar.e();
                        c = 1;
                    } else {
                        ekyVar.a = 2;
                        ekyVar.d = c2;
                        ekyVar.c = 1;
                        c = 2;
                    }
                } else {
                    if (c2 != null) {
                        ekyVar.d = c2;
                        ekyVar.c++;
                    } else {
                        if (codePointAt == 65038) {
                            ekyVar.e();
                        } else if (!eky.c(codePointAt)) {
                            fcp fcpVar = ekyVar.d;
                            if (fcpVar.b != null) {
                                c = 3;
                                if (ekyVar.c == 1) {
                                    if (ekyVar.d()) {
                                        ekyVar.e = ekyVar.d;
                                        ekyVar.e();
                                    } else {
                                        ekyVar.e();
                                    }
                                } else {
                                    ekyVar.e = fcpVar;
                                    ekyVar.e();
                                }
                            } else {
                                ekyVar.e();
                            }
                        }
                        c = 1;
                    }
                    c = 2;
                }
                ekyVar.b = codePointAt;
                if (c != 1) {
                    if (c != 2) {
                        if (z || !d(charSequence, i4, i6, ekyVar.b())) {
                            i5++;
                            z2 = ekvVar.b(charSequence, i4, i6, ekyVar.b());
                        }
                    } else {
                        i6 += Character.charCount(codePointAt);
                        if (i6 < i2) {
                            codePointAt = Character.codePointAt(charSequence, i6);
                        }
                    }
                } else {
                    i4 += Character.charCount(Character.codePointAt(charSequence, i4));
                    if (i4 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i4);
                    }
                    i6 = i4;
                }
            }
        }
        if (ekyVar.a == 2 && ekyVar.d.b != null && ((ekyVar.c > 1 || ekyVar.d()) && i5 < i3 && z2 && (z || !d(charSequence, i4, i6, ekyVar.a())))) {
            ekvVar.b(charSequence, i4, i6, ekyVar.a());
        }
        return ekvVar.a();
    }
}
