package defpackage;

import android.net.Uri;
import android.webkit.MimeTypeMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afdl {
    private static final alvi a = alvi.m("com/google/android/libraries/compose/attachments/resolver/AttachmentResolver");
    private final afdv b;
    private final anca c;
    private final apwt d;
    private final apwt e;
    private final armf f;
    private final arml g;

    public afdl(afdv afdvVar, anca ancaVar, apwt apwtVar, apwt apwtVar2, armf armfVar, armf armfVar2) {
        afdvVar.getClass();
        ancaVar.getClass();
        apwtVar.getClass();
        apwtVar2.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.b = afdvVar;
        this.c = ancaVar;
        this.d = apwtVar;
        this.e = apwtVar2;
        this.f = armfVar;
        this.g = armd.a(new aetz(armfVar2, 12));
    }

    private final afdm d() {
        return (afdm) this.g.a();
    }

    private final afdp e(afsx afsxVar) {
        if (d.F(afsxVar.b, afss.a) && !d().c) {
            return null;
        }
        afdp afdpVar = (afdp) ((Map) this.d.b()).get(afsxVar);
        if (afdpVar == null) {
            return (afdp) ((Map) this.e.b()).get(afsxVar.b);
        }
        return afdpVar;
    }

    private static final afsx f(Uri uri, String str, arqg arqgVar) {
        afsx afsxVar;
        if ((str == null || (afsxVar = afwv.H(str)) == null) && (afsxVar = (afsx) arqgVar.a()) == null) {
            String uri2 = uri.toString();
            uri2.getClass();
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(uri2);
            if (fileExtensionFromUrl != null) {
                MimeTypeMap singleton = MimeTypeMap.getSingleton();
                String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                String mimeTypeFromExtension = singleton.getMimeTypeFromExtension(lowerCase);
                if (mimeTypeFromExtension != null) {
                    return afwv.H(mimeTypeFromExtension);
                }
                return null;
            }
            return null;
        }
        return afsxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.afdt r18, android.net.Uri r19, defpackage.afcp r20, boolean r21, defpackage.arqg r22, defpackage.arpe r23) {
        /*
            Method dump skipped, instructions count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdl.a(afdt, android.net.Uri, afcp, boolean, arqg, arpe):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(android.net.Uri r18, defpackage.afcp r19, defpackage.arqg r20, defpackage.arpe r21) {
        /*
            Method dump skipped, instructions count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdl.b(android.net.Uri, afcp, arqg, arpe):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00b1, code lost:
    
        if (r6 == null) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(android.net.Uri r20, defpackage.afcp r21, boolean r22, defpackage.arqg r23, defpackage.arpe r24) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afdl.c(android.net.Uri, afcp, boolean, arqg, arpe):java.lang.Object");
    }
}
