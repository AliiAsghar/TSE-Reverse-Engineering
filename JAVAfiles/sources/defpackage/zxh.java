package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zxh extends zxi {
    public static final alhr a = uuh.w("no_connection_bottom_bar_enable_ui");
    public final armf b;
    public final armf c;
    public final zxf d;
    public final b e = new b();

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public final class a implements akvv {
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v3, types: [armf, java.lang.Object] */
    public zxh(armf armfVar, armf armfVar2, armf armfVar3) {
        this.b = armfVar;
        zai zaiVar = (zai) armfVar2.b();
        eno enoVar = ((zxg) armfVar.b()).a;
        ansy ansyVar = (ansy) zaiVar.e.b();
        ansyVar.getClass();
        anen anenVar = (anen) zaiVar.b.b();
        anenVar.getClass();
        xyt xytVar = (xyt) zaiVar.d.b();
        xytVar.getClass();
        ahiy ahiyVar = (ahiy) zaiVar.c.b();
        ahiyVar.getClass();
        qze qzeVar = (qze) zaiVar.a.b();
        qzeVar.getClass();
        enoVar.getClass();
        this.d = new zxf(ansyVar, anenVar, xytVar, ahiyVar, qzeVar, enoVar);
        this.c = armfVar3;
    }

    public static View a(zxg zxgVar) {
        return zxgVar.L().findViewById(R.id.bottom_bar_container);
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    final class b implements akgh<zxe> {
        public b() {
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void c(Object obj) {
            View a = zxh.a((zxg) zxh.this.b.b());
            boolean z = ((zxe) obj).a;
            if (((Boolean) ((utz) zxh.a.get()).e()).booleanValue() && z) {
                a.setVisibility(0);
            } else {
                a.setVisibility(8);
            }
            aktp.L(new a(), a);
        }

        @Override // defpackage.akgh
        public final /* synthetic */ void b() {
        }

        @Override // defpackage.akgh
        public final void a(Throwable th) {
        }
    }
}
