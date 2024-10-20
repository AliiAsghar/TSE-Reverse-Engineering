package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bbm implements ddm {
    public final View a;
    public final bbe b;
    public ayd e;
    public bfb f;
    public deo g;
    public Rect l;
    public final bbj m;
    public arqr c = AnonymousClass2.a;
    public arqr d = AnonymousClass3.a;
    public doj h = new doj("", djc.a, 4);
    public dno i = dno.a;
    public final List j = new ArrayList();
    public final arml k = armd.b(3, new AnonymousClass1());

    /* compiled from: PG */
    /* renamed from: bbm$1, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass1 extends arrp implements arqg<BaseInputConnection> {
        public AnonymousClass1() {
            super(0);
        }

        @Override // defpackage.arqg
        public final /* bridge */ /* synthetic */ Object a() {
            return new BaseInputConnection(bbm.this.a, false);
        }
    }

    /* compiled from: PG */
    /* renamed from: bbm$2, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass2 extends arrp implements arqr<List<? extends dnd>, arnb> {
        public static final AnonymousClass2 a = new AnonymousClass2();

        public AnonymousClass2() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* bridge */ /* synthetic */ Object a(Object obj) {
            return arnb.a;
        }
    }

    /* compiled from: PG */
    /* renamed from: bbm$3, reason: invalid class name */
    /* loaded from: classes.dex */
    static final class AnonymousClass3 extends arrp implements arqr<dnn, arnb> {
        public static final AnonymousClass3 a = new AnonymousClass3();

        public AnonymousClass3() {
            super(1);
        }

        @Override // defpackage.arqr
        public final /* synthetic */ Object a(Object obj) {
            int i = ((dnn) obj).a;
            return arnb.a;
        }
    }

    public bbm(View view, arqr arqrVar, bbe bbeVar) {
        this.a = view;
        this.b = bbeVar;
        this.m = new bbj(arqrVar, bbeVar);
    }
}
