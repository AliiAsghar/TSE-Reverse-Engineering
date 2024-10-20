package defpackage;

import android.net.Uri;
import android.util.Size;
import j$.time.Duration;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aful implements afdp {
    public static final Duration a;
    public static final Size b;
    private static final alvi d;
    public final atsg c;
    private final anca e;
    private final armf f;
    private final arml g;

    static {
        Duration duration = Duration.ZERO;
        duration.getClass();
        a = duration;
        b = new Size(0, 0);
        d = alvi.m("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver");
    }

    public aful(atsg atsgVar, anca ancaVar, armf armfVar, armf armfVar2) {
        atsgVar.getClass();
        ancaVar.getClass();
        armfVar.getClass();
        armfVar2.getClass();
        this.c = atsgVar;
        this.e = ancaVar;
        this.f = armfVar;
        this.g = armd.a(new afpw(armfVar2, 5));
    }

    public static /* synthetic */ Object d(aful afulVar, afdt afdtVar, Uri uri, afsx afsxVar, afcp afcpVar, boolean z, arpe arpeVar) {
        afsx afsxVar2;
        if (afsxVar == null) {
            String e = afdtVar.e();
            if (e != null) {
                afsxVar2 = afwv.H(e);
            } else {
                afsxVar2 = null;
            }
        } else {
            afsxVar2 = afsxVar;
        }
        if (afsxVar2 != null) {
            afru a2 = afrt.a(afsxVar2, afulVar.f().d);
            if (a2 == null) {
                ((alvg) d.h().h("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver", "fromCursor$suspendImpl", 70, "LocalMediaResolver.kt")).D("Cannot resolve format from %s (parameter) and %s (cursor), falling back to image", afsxVar, afdtVar.e());
                a2 = afsk.b;
            }
            return afulVar.c(a2, uri, afdtVar.d(), afdtVar.c(), afcpVar, new afuk(afulVar, afdtVar, uri, z, (arpe) null, 1, (byte[]) null), new afuk(afulVar, afdtVar, uri, z, null, 0), new afuk(afulVar, afdtVar, uri, z, (arpe) null, 2, (char[]) null), arpeVar);
        }
        throw new IllegalArgumentException("Media type was unspecified and not found in Cursor metadata (" + afdtVar.e() + ")");
    }

    public static /* synthetic */ Object e(aful afulVar, afru afruVar, Uri uri, Long l, Instant instant, afcp afcpVar, arpe arpeVar) {
        return afulVar.c(afruVar, uri, l, instant, afcpVar, new ikv(afulVar, uri, (arpe) null, 12), new ikv(afulVar, uri, (arpe) null, 13, (byte[]) null), new ikv(afulVar, uri, (arpe) null, 14, (char[]) null), arpeVar);
    }

    private final afdm f() {
        return (afdm) this.g.a();
    }

    private final Object g(Uri uri, arpe arpeVar) {
        ((alvg) d.i().h("com/google/android/libraries/compose/media/local/resolver/LocalMediaResolver", "getSizeBytesWhenMissing", 290, "LocalMediaResolver.kt")).t("Missing size bytes, falling back to input stream %b", Boolean.valueOf(f().b));
        if (f().b) {
            return ((addp) this.f.b()).b(uri, arpeVar);
        }
        return new Long(0L);
    }

    @Override // defpackage.afdp
    public final Object a(afdt afdtVar, Uri uri, afsx afsxVar, afcp afcpVar, boolean z, arpe arpeVar) {
        return d(this, afdtVar, uri, afsxVar, afcpVar, z, arpeVar);
    }

    @Override // defpackage.afdp
    public final Object b(afru afruVar, Uri uri, afcp afcpVar, arpe arpeVar) {
        return e(this, afruVar, uri, null, null, afcpVar, arpeVar);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x002c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.afru r28, android.net.Uri r29, java.lang.Long r30, j$.time.Instant r31, defpackage.afcp r32, defpackage.arqr r33, defpackage.arqr r34, defpackage.arqr r35, defpackage.arpe r36) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aful.c(afru, android.net.Uri, java.lang.Long, j$.time.Instant, afcp, arqr, arqr, arqr, arpe):java.lang.Object");
    }
}
