package defpackage;

import android.R;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aadu extends aadv {
    public static final alwo a = alwo.o("BugleRbmDeepLinking");
    public final Activity b;
    public final armf c;
    public final armf d;
    public final armf e;
    public final armf f;
    public final armf g;
    public final armf h;
    public final armf i;
    public final armf j;
    public final armf k;
    public final armf l;
    public final armf m;
    private final aadt o;
    private final armf p;

    public aadu(Activity activity, aadt aadtVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, armf armfVar7, armf armfVar8, armf armfVar9, armf armfVar10, armf armfVar11, armf armfVar12, armf armfVar13, armf armfVar14, armf armfVar15, armf armfVar16) {
        activity.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        armfVar5.getClass();
        armfVar6.getClass();
        armfVar7.getClass();
        armfVar8.getClass();
        armfVar9.getClass();
        armfVar10.getClass();
        armfVar11.getClass();
        armfVar15.getClass();
        armfVar16.getClass();
        this.b = activity;
        this.o = aadtVar;
        this.c = armfVar;
        this.d = armfVar2;
        this.e = armfVar3;
        this.f = armfVar5;
        this.g = armfVar6;
        this.h = armfVar8;
        this.i = armfVar10;
        this.j = armfVar11;
        this.k = armfVar12;
        this.p = armfVar13;
        this.l = armfVar14;
        this.m = armfVar15;
    }

    public static final Uri d(Uri uri) {
        if (uri != null && uri.isHierarchical()) {
            return uri;
        }
        if (uri != null) {
            String uri2 = uri.toString();
            uri2.getClass();
            int T = arsd.T(uri2, ":", 0, 2);
            if (T >= 0) {
                uri2 = arsd.C(uri2, T, T + 1, "://").toString();
            }
            return Uri.parse(uri2);
        }
        return null;
    }

    public static final boolean e(Intent intent) {
        String str;
        Uri data = intent.getData();
        if (data != null) {
            str = data.getScheme();
        } else {
            str = null;
        }
        return d.F(str, "sms");
    }

    public final String a(Intent intent) {
        Uri data = intent.getData();
        if (data != null) {
            Uri d = d(data);
            if (d != null) {
                return d.getQueryParameter("bot-id");
            }
            return null;
        }
        return null;
    }

    public final void b(Uri uri, String str, String str2) {
        ((alwl) a.g()).t("RBM deep link Url fallback: %s", uri);
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        try {
            akto.n(this.o.F(), intent);
            this.b.finish();
        } catch (ActivityNotFoundException e) {
            ((alwl) ((alwl) a.i()).g(e)).t("Activity was not found for intent, %s", intent);
            ((psi) this.h.b()).k(8, str, str2);
            c();
        }
    }

    public final void c() {
        ((alwl) a.g()).q("RBM Deep Link Error Page");
        aadw aadwVar = new aadw();
        apxh.e(aadwVar);
        bd bdVar = new bd(this.o.F().a());
        bdVar.z(R.id.content, aadwVar);
        bdVar.b();
    }

    public final void f(int i, String str, String str2, boolean z) {
        psi psiVar = (psi) this.h.b();
        aozy createBuilder = amtf.a.createBuilder();
        createBuilder.getClass();
        aktp.bh(9, createBuilder);
        aktp.bg(i, createBuilder);
        aktp.bf(z, createBuilder);
        psiVar.e(aktp.be(createBuilder), str, str2);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akgh<psa> {
        public a() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
            String str;
            ((alwl) ((alwl) aadu.a.i()).g(th)).q("Failed to retrieve bot metadata.");
            psi psiVar = (psi) aadu.this.h.b();
            aadu aaduVar = aadu.this;
            Intent intent = aaduVar.b.getIntent();
            intent.getClass();
            String a = aaduVar.a(intent);
            Uri data = aadu.this.b.getIntent().getData();
            if (data != null) {
                str = data.getScheme();
            } else {
                str = null;
            }
            psiVar.k(10, a, str);
            aadu.this.c();
        }

        /* JADX WARN: Removed duplicated region for block: B:119:0x00a3  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00e8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0276  */
        @Override // defpackage.akgh
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final /* synthetic */ void c(java.lang.Object r18) {
            /*
                Method dump skipped, instructions count: 815
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: aadu.a.c(java.lang.Object):void");
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }
    }
}
