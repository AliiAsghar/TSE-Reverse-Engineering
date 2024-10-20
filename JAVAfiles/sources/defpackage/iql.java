package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;
import j$.util.Optional;
import java.io.FileNotFoundException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class iql {
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public iql(hrc hrcVar, hrc hrcVar2, hrc hrcVar3, hpk hpkVar, hpm hpmVar) {
        this.b = hzc.a(150, new hpc(this, 0));
        this.d = hrcVar;
        this.f = hrcVar2;
        this.e = hrcVar3;
        this.a = hpkVar;
        this.c = hpmVar;
    }

    public static final boolean f(Long l) {
        tbs d = PartsTable.d();
        d.g(new idc(1));
        long l2 = d.b().l(PartsTable.d.a);
        if (l != null && l.longValue() == l2) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r14v11, types: [arpi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v6, types: [armf, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iql.a(arpe):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r12v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v35, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v8, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v7, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.arpe r12) {
        /*
            Method dump skipped, instructions count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iql.b(arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r0v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v4, types: [arpi, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r11, int r12, defpackage.qhy r13, defpackage.arpe r14) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iql.c(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, int, qhy, arpe):java.lang.Object");
    }

    public final ParcelFileDescriptor d(Uri uri, String str, aipw aipwVar) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = aipx.a((Context) this.b, uri, "r", aipwVar).getParcelFileDescriptor();
            parcelFileDescriptor.getClass();
            return parcelFileDescriptor;
        } catch (FileNotFoundException e) {
            alwl alwlVar = (alwl) ((aluw) this.c).i();
            alwlVar.X(ydl.s, str);
            alwlVar.X(ydl.R, uri);
            ((alwl) alwlVar.g(e)).q("File not found when opening uri file descriptor");
            throw new idl("File not found when opening uri file descriptor", e);
        }
    }

    public final aipw e(Uri uri) {
        String authority = uri.getAuthority();
        if (authority != null && arsd.z(authority, "mms", false)) {
            return aipw.a((String) this.e);
        }
        aipw aipwVar = aipw.b;
        aipwVar.getClass();
        return aipwVar;
    }

    public iql(Context context, rjx rjxVar, armf armfVar, armf armfVar2) {
        context.getClass();
        rjxVar.getClass();
        this.b = context;
        this.a = rjxVar;
        this.d = armfVar;
        this.f = armfVar2;
        this.c = alwo.o("BugleBackup");
        this.e = "com.android.providers.telephony";
    }

    public iql(armf armfVar, arpi arpiVar, arpi arpiVar2, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5) {
        armfVar.getClass();
        arpiVar.getClass();
        arpiVar2.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.f = armfVar;
        this.b = arpiVar2;
        this.a = armfVar2;
        this.c = armfVar3;
        this.d = armfVar4;
        this.e = armfVar5;
    }

    public iql(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6, byte[] bArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.d = armfVar2;
        armfVar3.getClass();
        this.c = armfVar3;
        armfVar4.getClass();
        this.f = armfVar4;
        armfVar5.getClass();
        this.b = armfVar5;
        armfVar6.getClass();
        this.e = armfVar6;
    }

    public iql(armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4, armf armfVar5, armf armfVar6) {
        armfVar.getClass();
        this.c = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
        armfVar3.getClass();
        this.f = armfVar3;
        armfVar4.getClass();
        this.d = armfVar4;
        armfVar5.getClass();
        this.e = armfVar5;
        armfVar6.getClass();
        this.a = armfVar6;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v11, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v3, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v12, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v20, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v22, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v6, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [armf, java.lang.Object] */
    public iql(lig ligVar, iql iqlVar, iji ijiVar, jgq jgqVar, arqg arqgVar, inn innVar, Supplier supplier) {
        this.a = jgqVar;
        this.b = new hgj(innVar);
        Activity activity = (Activity) ligVar.d.b();
        gqg gqgVar = (gqg) ligVar.c.b();
        mci mciVar = (mci) ligVar.e.b();
        arpi arpiVar = (arpi) ligVar.f.b();
        arpiVar.getClass();
        zkm zkmVar = (zkm) ligVar.l.b();
        aajt aajtVar = (aajt) ligVar.k.b();
        Context context = (Context) ligVar.b.b();
        context.getClass();
        arpi arpiVar2 = (arpi) ligVar.h.b();
        arpiVar2.getClass();
        arwe arweVar = (arwe) ligVar.i.b();
        arweVar.getClass();
        abac abacVar = (abac) ligVar.j.b();
        aant aantVar = (aant) ligVar.g.b();
        aantVar.getClass();
        this.c = new qdq(activity, gqgVar, mciVar, arpiVar, zkmVar, aajtVar, context, arpiVar2, arweVar, abacVar, aantVar, arqgVar, supplier);
        Activity activity2 = (Activity) iqlVar.c.b();
        gqg gqgVar2 = (gqg) iqlVar.b.b();
        arpi arpiVar3 = (arpi) iqlVar.f.b();
        arpiVar3.getClass();
        mci mciVar2 = (mci) iqlVar.d.b();
        rys rysVar = (rys) iqlVar.e.b();
        rysVar.getClass();
        ydh ydhVar = (ydh) iqlVar.a.b();
        ydhVar.getClass();
        this.d = new iqe(activity2, gqgVar2, arpiVar3, mciVar2, rysVar, ydhVar, arqgVar, supplier);
        Activity activity3 = (Activity) ijiVar.a.b();
        gqg gqgVar3 = (gqg) ijiVar.c.b();
        Optional optional = (Optional) ijiVar.b.b();
        optional.getClass();
        this.e = new qdq(activity3, gqgVar3, optional, arqgVar, supplier);
        this.f = new hgj(innVar);
    }
}
