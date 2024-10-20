package defpackage;

import android.content.Context;
import android.net.Uri;
import android.provider.ContactsContract;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class qnu {
    public final Object a;
    public final Object b;

    public qnu(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public static boolean b(String str) {
        if (str != null && str.contains("@")) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [armf, java.lang.Object] */
    public static /* synthetic */ ych c(qnu qnuVar, Uri uri, String str, ycg ycgVar) {
        if (((yjf) qnuVar.b.b()).f()) {
            long j = ycgVar.c;
            Uri.Builder buildUpon = uri.buildUpon();
            if (uri.equals(ContactsContract.CommonDataKinds.Phone.CONTENT_FILTER_URI) || uri.equals(ContactsContract.CommonDataKinds.Email.CONTENT_FILTER_URI)) {
                buildUpon.appendQueryParameter("limit", (String) yce.a.e());
            }
            Uri build = buildUpon.appendPath(str).appendQueryParameter("directory", String.valueOf(j)).build();
            return new ych(ycgVar, new rri((Context) qnuVar.a, build, qli.a, null, null, "sort_key").a());
        }
        return new ych(ycgVar, null);
    }

    public static final aoia i(qfb qfbVar, qei qeiVar) {
        return new aoia(qfbVar, alog.r(qeiVar), true);
    }

    public final ych a(String str, ycg ycgVar) {
        Uri uri;
        Uri uri2;
        if (!b(str)) {
            uri = ContactsContract.CommonDataKinds.Phone.ENTERPRISE_CONTENT_FILTER_URI;
            return c(this, uri, str, ycgVar);
        }
        uri2 = ContactsContract.CommonDataKinds.Email.ENTERPRISE_CONTENT_FILTER_URI;
        return c(this, uri2, str, ycgVar);
    }

    public final aoia d(String str) {
        return new aoia(((psq) this.a).a(str, false));
    }

    public final aoia e(qfb qfbVar, String str) {
        return new aoia(qfbVar, alog.r(((psq) this.a).a(str, false)), true);
    }

    public final aoia f(String str, String str2, qei qeiVar) {
        return new aoia(((hgj) this.b).o(str, str2), alog.r(qeiVar), true);
    }

    public final aoia g(qfb qfbVar, Collection collection) {
        d.t(!collection.isEmpty(), "Group recipients is empty");
        alob alobVar = new alob();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            msh mshVar = (msh) it.next();
            String g = mshVar.g();
            if (g != null) {
                alobVar.h(((psq) this.a).e(mshVar, g));
            }
        }
        return new aoia(qfbVar, alobVar.g(), false);
    }

    public final aoia h(String str, String str2, Collection collection) {
        return g(((hgj) this.b).o(str, str2), collection);
    }

    public qnu(psq psqVar, hgj hgjVar) {
        this.a = psqVar;
        this.b = hgjVar;
    }

    public qnu(qhr qhrVar, qhh qhhVar) {
        this.b = qhrVar;
        this.a = qhhVar;
    }

    public qnu() {
        this.a = new AtomicBoolean(false);
        this.b = new AtomicBoolean(false);
    }

    public qnu(armf armfVar, armf armfVar2, char[] cArr) {
        armfVar.getClass();
        this.a = armfVar;
        armfVar2.getClass();
        this.b = armfVar2;
    }

    public qnu(arwe arweVar, armf armfVar, armf armfVar2, armf armfVar3, armf armfVar4) {
        arweVar.getClass();
        armfVar2.getClass();
        armfVar3.getClass();
        armfVar4.getClass();
        this.b = arweVar;
        this.a = armfVar;
    }

    public qnu(armf armfVar, armf armfVar2) {
        armfVar.getClass();
        armfVar2.getClass();
        this.b = armfVar;
        this.a = armfVar2;
    }

    public qnu(armf armfVar, armf armfVar2, byte[] bArr, byte[] bArr2) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public qnu(armf armfVar, armf armfVar2, byte[] bArr) {
        armfVar.getClass();
        this.b = armfVar;
        armfVar2.getClass();
        this.a = armfVar2;
    }

    public qnu(armf armfVar, arwe arweVar) {
        armfVar.getClass();
        arweVar.getClass();
        this.a = armfVar;
        this.b = arweVar;
    }
}
