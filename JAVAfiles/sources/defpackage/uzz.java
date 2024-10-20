package defpackage;

import android.net.Uri;
import android.util.Base64;
import j$.time.Instant;
import j$.util.Optional;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class uzz {
    public static final String a(apwq apwqVar) {
        Optional i = wam.i(apwqVar, vxt.IMAGE_CAPTION_NAMESPACE, "Image-Caption");
        if (i.isPresent()) {
            byte[] decode = Base64.decode((String) i.get(), 2);
            decode.getClass();
            return new String(decode, arul.a);
        }
        return null;
    }

    public static int b(int i) {
        return i - 2;
    }

    public static final boolean c(Uri uri) {
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() < 2) {
            return false;
        }
        return d.F(pathSegments.get(pathSegments.size() - 2), "cms_attachments");
    }

    public static boolean d() {
        return ((Boolean) ((uzf) yyb.aL(uzf.class)).LO().b()).booleanValue();
    }

    public static final /* synthetic */ agpw e() {
        Integer valueOf;
        snh snhVar = new snh();
        valueOf = Integer.valueOf(a.bp().c());
        int intValue = valueOf.intValue();
        if (intValue < 8500) {
            agnc.t("source_type", intValue);
        }
        snhVar.U(new agoi("conversations.source_type", 2, 4));
        return new agpw(snhVar);
    }

    public static final boolean f() {
        if (ofn.a() || qop.h()) {
            return true;
        }
        return false;
    }

    public static final boolean g() {
        if (ofn.a()) {
            return true;
        }
        if (qop.h() && anfi.a("bugle.migrate_trusted_contacts_api_to_shared", "bugle")) {
            return true;
        }
        return false;
    }

    public static String h(UUID uuid) {
        if (uuid.toString().isEmpty()) {
            return null;
        }
        return uuid.toString();
    }

    public static UUID i() {
        return UUID.nameUUIDFromBytes(new byte[0]);
    }

    public static Optional j() {
        return Optional.of(UUID.randomUUID());
    }

    public static long k(Instant instant) {
        if (instant == null) {
            return 0L;
        }
        return instant.toEpochMilli();
    }

    public static Instant l(long j) {
        if (j == 0) {
            return Instant.EPOCH;
        }
        return Instant.ofEpochMilli(j);
    }

    public static agmh[] m() {
        return (agmh[]) rnx.e.k;
    }
}
