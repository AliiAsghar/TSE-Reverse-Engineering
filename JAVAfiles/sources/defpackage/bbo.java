package defpackage;

import android.R;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import defpackage.div;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbo implements InputConnection {
    public doj a;
    public int b;
    public boolean c;
    private final bbd e;
    private final ayd f;
    private final bfb g;
    private final deo h;
    private int i;
    private final List j = new ArrayList();
    public boolean d = true;

    /* compiled from: PG */
    /* renamed from: bbo$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqr<dnd, arnb> {
        public AnonymousClass1() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            bbo.this.a((dnd) obj);
            return arnb.a;
        }
    }

    public bbo(doj dojVar, bbd bbdVar, ayd aydVar, bfb bfbVar, deo deoVar) {
        this.e = bbdVar;
        this.f = aydVar;
        this.g = bfbVar;
        this.h = deoVar;
        this.a = dojVar;
    }

    private final void c(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    private final void d() {
        this.i++;
    }

    public final void a(dnd dndVar) {
        d();
        try {
            this.j.add(dndVar);
        } finally {
            b();
        }
    }

    public final boolean b() {
        int i = this.i - 1;
        this.i = i;
        if (i == 0 && !this.j.isEmpty()) {
            bbd bbdVar = this.e;
            List list = this.j;
            ((bbn) bbdVar).a.c.a(aqjn.az(list));
            this.j.clear();
        }
        if (this.i > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        if (this.d) {
            d();
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.j.clear();
        this.i = 0;
        this.d = false;
        bbn bbnVar = (bbn) this.e;
        int size = bbnVar.a.j.size();
        for (int i = 0; i < size; i++) {
            if (d.F(((WeakReference) bbnVar.a.j.get(i)).get(), this)) {
                bbnVar.a.j.remove(i);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        if (this.d) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new dmw(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        if (this.d) {
            a(new dnb(i, i2));
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        if (this.d) {
            a(new dnc(i, i2));
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return b();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        if (this.d) {
            a(new dnj());
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(this.a.a(), djc.d(this.a.b), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        boolean z = true;
        int i2 = i & 1;
        int i3 = 0;
        if (1 != i2) {
            z = false;
        }
        this.c = z;
        if (i2 != 0) {
            if (extractedTextRequest != null) {
                i3 = extractedTextRequest.token;
            }
            this.b = i3;
        }
        return bbp.a(this.a);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (djc.h(this.a.b)) {
            return null;
        }
        return dok.a(this.a).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        return dok.b(this.a, i).b;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        return dok.c(this.a, i).b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        if (this.d) {
            switch (i) {
                case R.id.selectAll:
                    a(new doi(0, this.a.a().length()));
                    break;
                case R.id.cut:
                    c(277);
                    break;
                case R.id.copy:
                    c(278);
                    break;
                case R.id.paste:
                    c(279);
                    break;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        if (this.d) {
            if (i != 0) {
                switch (i) {
                    case 2:
                        i2 = 2;
                        break;
                    case 3:
                        i2 = 3;
                        break;
                    case 4:
                        i2 = 4;
                        break;
                    case 5:
                        i2 = 6;
                        break;
                    case 6:
                        i2 = 7;
                        break;
                    case 7:
                        i2 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", a.bV(i, "IME sends unsupported Editor Action: "));
                        break;
                }
                ((bbn) this.e).a.d.a(new dnn(i2));
                return true;
            }
            i2 = 1;
            ((bbn) this.e).a.d.a(new dnn(i2));
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, final IntConsumer intConsumer) {
        dhv dhvVar;
        dhv dhvVar2;
        PointF startPoint;
        PointF endPoint;
        long j;
        int i;
        int intValue;
        PointF insertionPoint;
        baa d;
        String textToInsert;
        diy diyVar;
        PointF joinOrSplitPoint;
        baa d2;
        diy diyVar2;
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity2;
        int granularity3;
        RectF deletionArea;
        RectF selectionArea;
        int granularity4;
        diy diyVar3;
        if (Build.VERSION.SDK_INT >= 34) {
            ayd aydVar = this.f;
            bfb bfbVar = this.g;
            deo deoVar = this.h;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1();
            final int i2 = 3;
            if (aydVar != null && (dhvVar = aydVar.j) != null) {
                baa d3 = aydVar.d();
                diy diyVar4 = null;
                if (d3 != null && (diyVar3 = d3.a) != null) {
                    dhvVar2 = diyVar3.a.a;
                } else {
                    dhvVar2 = null;
                }
                if (d.F(dhvVar, dhvVar2)) {
                    if (a$$ExternalSyntheticApiModelOutline0.m19m((Object) handwritingGesture)) {
                        SelectGesture m13m = a$$ExternalSyntheticApiModelOutline0.m13m((Object) handwritingGesture);
                        selectionArea = m13m.getSelectionArea();
                        cjp e = clv.e(selectionArea);
                        granularity4 = m13m.getGranularity();
                        int e2 = bba.e(granularity4);
                        int i3 = div.a;
                        long c = bbc.c(aydVar, e, e2, div.a.b);
                        if (djc.h(c)) {
                            i2 = bba.a(m13m, anonymousClass1);
                        } else {
                            bba.d(c, bfbVar, anonymousClass1);
                            i2 = 1;
                        }
                    } else if (a$$ExternalSyntheticApiModelOutline0.m$4(handwritingGesture)) {
                        DeleteGesture m8m = a$$ExternalSyntheticApiModelOutline0.m8m((Object) handwritingGesture);
                        granularity3 = m8m.getGranularity();
                        int e3 = bba.e(granularity3);
                        deletionArea = m8m.getDeletionArea();
                        cjp e4 = clv.e(deletionArea);
                        int i4 = div.a;
                        long c2 = bbc.c(aydVar, e4, e3, div.a.b);
                        if (djc.h(c2)) {
                            i2 = bba.a(m8m, anonymousClass1);
                        } else {
                            bba.b(c2, dhvVar, a.bA(e3, 1), anonymousClass1);
                            i2 = 1;
                        }
                    } else if (a$$ExternalSyntheticApiModelOutline0.m$5(handwritingGesture)) {
                        SelectRangeGesture m14m = a$$ExternalSyntheticApiModelOutline0.m14m((Object) handwritingGesture);
                        selectionStartArea = m14m.getSelectionStartArea();
                        cjp e5 = clv.e(selectionStartArea);
                        selectionEndArea = m14m.getSelectionEndArea();
                        cjp e6 = clv.e(selectionEndArea);
                        granularity2 = m14m.getGranularity();
                        int e7 = bba.e(granularity2);
                        int i5 = div.a;
                        long d4 = bbc.d(aydVar, e5, e6, e7, div.a.b);
                        if (djc.h(d4)) {
                            i2 = bba.a(m14m, anonymousClass1);
                        } else {
                            bba.d(d4, bfbVar, anonymousClass1);
                            i2 = 1;
                        }
                    } else if (a$$ExternalSyntheticApiModelOutline0.m$3(handwritingGesture)) {
                        DeleteRangeGesture m9m = a$$ExternalSyntheticApiModelOutline0.m9m((Object) handwritingGesture);
                        granularity = m9m.getGranularity();
                        int e8 = bba.e(granularity);
                        deletionStartArea = m9m.getDeletionStartArea();
                        cjp e9 = clv.e(deletionStartArea);
                        deletionEndArea = m9m.getDeletionEndArea();
                        cjp e10 = clv.e(deletionEndArea);
                        int i6 = div.a;
                        long d5 = bbc.d(aydVar, e9, e10, e8, div.a.b);
                        if (djc.h(d5)) {
                            i2 = bba.a(m9m, anonymousClass1);
                        } else {
                            bba.b(d5, dhvVar, a.bA(e8, 1), anonymousClass1);
                            i2 = 1;
                        }
                    } else if (a$$ExternalSyntheticApiModelOutline0.m$6(handwritingGesture)) {
                        JoinOrSplitGesture m11m = a$$ExternalSyntheticApiModelOutline0.m11m((Object) handwritingGesture);
                        if (deoVar != null) {
                            joinOrSplitPoint = m11m.getJoinOrSplitPoint();
                            int b = bbc.b(aydVar, bbc.e(joinOrSplitPoint), deoVar);
                            if (b != -1 && ((d2 = aydVar.d()) == null || (diyVar2 = d2.a) == null || !bbc.f(diyVar2, b))) {
                                int i7 = b;
                                while (i7 > 0) {
                                    int codePointBefore = Character.codePointBefore(dhvVar, i7);
                                    if (!bbc.g(codePointBefore)) {
                                        break;
                                    } else {
                                        i7 -= Character.charCount(codePointBefore);
                                    }
                                }
                                while (b < dhvVar.a()) {
                                    int codePointAt = Character.codePointAt(dhvVar, b);
                                    if (!bbc.g(codePointAt)) {
                                        break;
                                    } else {
                                        b += Character.charCount(codePointAt);
                                    }
                                }
                                long a = djd.a(i7, b);
                                if (djc.h(a)) {
                                    bba.c(djc.e(a), " ", anonymousClass1);
                                } else {
                                    bba.b(a, dhvVar, false, anonymousClass1);
                                }
                                i2 = 1;
                            } else {
                                i2 = bba.a(m11m, anonymousClass1);
                            }
                        } else {
                            i2 = bba.a(m11m, anonymousClass1);
                        }
                    } else if (a$$ExternalSyntheticApiModelOutline0.m$1(handwritingGesture)) {
                        InsertGesture m10m = a$$ExternalSyntheticApiModelOutline0.m10m((Object) handwritingGesture);
                        if (deoVar != null) {
                            insertionPoint = m10m.getInsertionPoint();
                            int b2 = bbc.b(aydVar, bbc.e(insertionPoint), deoVar);
                            if (b2 != -1 && ((d = aydVar.d()) == null || (diyVar = d.a) == null || !bbc.f(diyVar, b2))) {
                                textToInsert = m10m.getTextToInsert();
                                bba.c(b2, textToInsert, anonymousClass1);
                                i2 = 1;
                            } else {
                                i2 = bba.a(m10m, anonymousClass1);
                            }
                        } else {
                            i2 = bba.a(m10m, anonymousClass1);
                        }
                    } else if (a$$ExternalSyntheticApiModelOutline0.m$2(handwritingGesture)) {
                        RemoveSpaceGesture m12m = a$$ExternalSyntheticApiModelOutline0.m12m((Object) handwritingGesture);
                        baa d6 = aydVar.d();
                        if (d6 != null) {
                            diyVar4 = d6.a;
                        }
                        startPoint = m12m.getStartPoint();
                        long e11 = bbc.e(startPoint);
                        endPoint = m12m.getEndPoint();
                        long e12 = bbc.e(endPoint);
                        cti e13 = aydVar.e();
                        if (diyVar4 != null && e13 != null) {
                            long l = e13.l(e11);
                            long l2 = e13.l(e12);
                            int a2 = bbc.a(diyVar4.b, l, deoVar);
                            int a3 = bbc.a(diyVar4.b, l2, deoVar);
                            if (a2 == -1) {
                                if (a3 == -1) {
                                    j = djc.a;
                                } else {
                                    a2 = a3;
                                }
                            } else if (a3 != -1) {
                                a2 = Math.min(a2, a3);
                            }
                            float d7 = diyVar4.d(a2) + diyVar4.a(a2);
                            int i8 = (int) (l2 >> 32);
                            int i9 = (int) (l >> 32);
                            float f = d7 / 2.0f;
                            cjp cjpVar = new cjp(Math.min(Float.intBitsToFloat(i9), Float.intBitsToFloat(i8)), (-0.1f) + f, Math.max(Float.intBitsToFloat(i9), Float.intBitsToFloat(i8)), f + 0.1f);
                            dia diaVar = diyVar4.b;
                            int i10 = div.a;
                            j = diaVar.e(cjpVar, 0, div.a.a);
                        } else {
                            j = djc.a;
                        }
                        if (djc.h(j)) {
                            i2 = bba.a(m12m, anonymousClass1);
                        } else {
                            arrz arrzVar = new arrz();
                            arrzVar.a = -1;
                            arrz arrzVar2 = new arrz();
                            arrzVar2.a = -1;
                            String str = dhvVar.subSequence(djc.d(j), djc.c(j)).b;
                            arus arusVar = new arus("\\s+");
                            baz bazVar = new baz(arrzVar, arrzVar2);
                            str.getClass();
                            aruo c3 = arusVar.c(str);
                            if (c3 != null) {
                                int length = str.length();
                                StringBuilder sb = new StringBuilder(length);
                                aruo aruoVar = c3;
                                int i11 = 0;
                                while (true) {
                                    sb.append((CharSequence) str, i11, aruoVar.b().d().intValue());
                                    aruo aruoVar2 = aruoVar;
                                    sb.append((CharSequence) bazVar.a(aruoVar2));
                                    intValue = aruoVar2.b().c().intValue() + 1;
                                    aruo c4 = aruoVar2.c();
                                    if (intValue >= length || c4 == null) {
                                        break;
                                    }
                                    aruoVar = c4;
                                    i11 = intValue;
                                }
                                if (intValue < length) {
                                    sb.append((CharSequence) str, intValue, length);
                                }
                                str = sb.toString();
                            }
                            int i12 = arrzVar.a;
                            if (i12 != -1 && (i = arrzVar2.a) != -1) {
                                int e14 = djc.e(j) + i12;
                                int e15 = djc.e(j);
                                String substring = str.substring(i12, str.length() - (djc.b(j) - arrzVar2.a));
                                substring.getClass();
                                anonymousClass1.a(new bbb(new dnd[]{new doi(e14, e15 + i), new dmw(substring, 1)}));
                                i2 = 1;
                            } else {
                                i2 = bba.a(m12m, anonymousClass1);
                            }
                        }
                    } else {
                        i2 = 2;
                    }
                }
            }
            if (intConsumer != null) {
                if (executor == null) {
                    intConsumer.accept(i2);
                } else {
                    executor.execute(new Runnable() { // from class: bau
                        @Override // java.lang.Runnable
                        public final void run() {
                            IntConsumer.this.accept(i2);
                        }
                    });
                }
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        if (this.d) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e2  */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture r7, android.os.CancellationSignal r8) {
        /*
            r6 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 34
            r2 = 0
            if (r0 < r1) goto Lea
            ayd r0 = r6.f
            bfb r1 = r6.g
            if (r0 == 0) goto Lea
            dhv r3 = r0.j
            if (r3 != 0) goto L13
            goto Lea
        L13:
            baa r4 = r0.d()
            r5 = 0
            if (r4 == 0) goto L23
            diy r4 = r4.a
            if (r4 == 0) goto L23
            dix r4 = r4.a
            dhv r4 = r4.a
            goto L24
        L23:
            r4 = r5
        L24:
            boolean r3 = defpackage.d.F(r3, r4)
            if (r3 != 0) goto L2c
            goto Lea
        L2c:
            boolean r3 = defpackage.a$$ExternalSyntheticApiModelOutline0.m19m(r7)
            if (r3 == 0) goto L58
            android.view.inputmethod.SelectGesture r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m13m(r7)
            if (r1 == 0) goto L55
            android.graphics.RectF r2 = defpackage.a$$ExternalSyntheticApiModelOutline0.m5m(r7)
            cjp r2 = defpackage.clv.e(r2)
            int r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.bba.e(r7)
            int r3 = defpackage.div.a
            div r3 = div.a.b
            long r2 = defpackage.bbc.c(r0, r2, r7, r3)
            r1.s(r2)
            goto Ldf
        L55:
            r1 = r5
            goto Ldf
        L58:
            boolean r3 = defpackage.a$$ExternalSyntheticApiModelOutline0.m$4(r7)
            if (r3 == 0) goto L80
            android.view.inputmethod.DeleteGesture r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m8m(r7)
            if (r1 == 0) goto L55
            android.graphics.RectF r2 = defpackage.a$$ExternalSyntheticApiModelOutline0.m3m(r7)
            cjp r2 = defpackage.clv.e(r2)
            int r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.bba.e(r7)
            int r3 = defpackage.div.a
            div r3 = div.a.b
            long r2 = defpackage.bbc.c(r0, r2, r7, r3)
            r1.p(r2)
            goto Ldf
        L80:
            boolean r3 = defpackage.a$$ExternalSyntheticApiModelOutline0.m$5(r7)
            if (r3 == 0) goto Lb0
            android.view.inputmethod.SelectRangeGesture r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m14m(r7)
            if (r1 == 0) goto L55
            android.graphics.RectF r2 = defpackage.a$$ExternalSyntheticApiModelOutline0.m6m(r7)
            cjp r2 = defpackage.clv.e(r2)
            android.graphics.RectF r3 = defpackage.a$$ExternalSyntheticApiModelOutline0.m$1(r7)
            cjp r3 = defpackage.clv.e(r3)
            int r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.bba.e(r7)
            int r4 = defpackage.div.a
            div r4 = div.a.b
            long r2 = defpackage.bbc.d(r0, r2, r3, r7, r4)
            r1.s(r2)
            goto Ldf
        Lb0:
            boolean r3 = defpackage.a$$ExternalSyntheticApiModelOutline0.m$3(r7)
            if (r3 == 0) goto Lea
            android.view.inputmethod.DeleteRangeGesture r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m9m(r7)
            if (r1 == 0) goto L55
            android.graphics.RectF r2 = defpackage.a$$ExternalSyntheticApiModelOutline0.m4m(r7)
            cjp r2 = defpackage.clv.e(r2)
            android.graphics.RectF r3 = defpackage.a$$ExternalSyntheticApiModelOutline0.m$1(r7)
            cjp r3 = defpackage.clv.e(r3)
            int r7 = defpackage.a$$ExternalSyntheticApiModelOutline0.m(r7)
            int r7 = defpackage.bba.e(r7)
            int r4 = defpackage.div.a
            div r4 = div.a.b
            long r2 = defpackage.bbc.d(r0, r2, r3, r7, r4)
            r1.p(r2)
        Ldf:
            r2 = 1
            if (r8 == 0) goto Lea
            bay r7 = new bay
            r7.<init>()
            r8.setOnCancelListener(r7)
        Lea:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbo.previewHandwritingGesture(android.view.inputmethod.PreviewableHandwritingGesture, android.os.CancellationSignal):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean requestCursorUpdates(int r10) {
        /*
            r9 = this;
            boolean r0 = r9.d
            r1 = 0
            if (r0 == 0) goto L73
            r0 = r10 & 1
            r2 = r10 & 2
            r3 = 1
            if (r2 == 0) goto Le
            r2 = r3
            goto Lf
        Le:
            r2 = r1
        Lf:
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 33
            if (r4 < r5) goto L4b
            r4 = r10 & 16
            if (r4 == 0) goto L1b
            r4 = r3
            goto L1c
        L1b:
            r4 = r1
        L1c:
            r5 = r10 & 8
            if (r5 == 0) goto L22
            r5 = r3
            goto L23
        L22:
            r5 = r1
        L23:
            r6 = r10 & 4
            if (r6 == 0) goto L29
            r6 = r3
            goto L2a
        L29:
            r6 = r1
        L2a:
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 34
            if (r7 < r8) goto L35
            r10 = r10 & 32
            if (r10 == 0) goto L35
            r1 = r3
        L35:
            if (r4 != 0) goto L48
            if (r5 != 0) goto L48
            if (r6 != 0) goto L48
            if (r1 != 0) goto L48
            int r10 = android.os.Build.VERSION.SDK_INT
            if (r10 < r8) goto L44
            r10 = r3
            r1 = r10
            goto L46
        L44:
            r10 = r1
            r1 = r3
        L46:
            r4 = r1
            goto L4d
        L48:
            r10 = r1
            r1 = r6
            goto L4e
        L4b:
            r10 = r1
            r4 = r3
        L4d:
            r5 = r4
        L4e:
            bbd r6 = r9.e
            bbn r6 = (defpackage.bbn) r6
            bbm r6 = r6.a
            bbj r6 = r6.m
            java.lang.Object r7 = r6.a
            monitor-enter(r7)
            r6.d = r4     // Catch: java.lang.Throwable -> L70
            r6.e = r5     // Catch: java.lang.Throwable -> L70
            r6.f = r1     // Catch: java.lang.Throwable -> L70
            r6.g = r10     // Catch: java.lang.Throwable -> L70
            if (r0 == 0) goto L6c
            r6.c = r3     // Catch: java.lang.Throwable -> L70
            doj r10 = r6.h     // Catch: java.lang.Throwable -> L70
            if (r10 == 0) goto L6c
            r6.a()     // Catch: java.lang.Throwable -> L70
        L6c:
            r6.b = r2     // Catch: java.lang.Throwable -> L70
            monitor-exit(r7)
            return r3
        L70:
            r10 = move-exception
            monitor-exit(r7)
            throw r10
        L73:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbo.requestCursorUpdates(int):boolean");
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        if (this.d) {
            ((BaseInputConnection) ((bbn) this.e).a.k.a()).sendKeyEvent(keyEvent);
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        boolean z = this.d;
        if (z) {
            a(new dog(i, i2));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        boolean z = this.d;
        if (z) {
            a(new doh(String.valueOf(charSequence), i));
        }
        return z;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        if (this.d) {
            a(new doi(i, i2));
            return true;
        }
        return false;
    }
}
