package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwx {
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil");
    public final armf a;
    private final Context c;
    private final uga d;
    private final xvc e;

    public xwx(Context context, uga ugaVar, xvc xvcVar, armf armfVar) {
        this.c = context;
        this.d = ugaVar;
        this.e = xvcVar;
        this.a = armfVar;
    }

    public final Bitmap a(Context context, Uri uri, int i, int i2) {
        ufu ufuVar = (ufu) this.d.a(new ufd(this.e, uri, i, i2, true).f(context));
        Bitmap bitmap = null;
        try {
            if (ufuVar != null) {
                try {
                    try {
                        Bitmap d = ufuVar.d();
                        d.getClass();
                        bitmap = yfo.d(d);
                    } catch (OutOfMemoryError unused) {
                        alvw i3 = b.i();
                        i3.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapForNotification", 107, "AvatarImageUtil.java")).q("OOM creating avatarBitmap");
                    }
                } catch (uft unused2) {
                    alvw i4 = b.i();
                    i4.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapForNotification", 109, "AvatarImageUtil.java")).q("Could not get bitmap from image type for building notifications");
                }
            }
            return bitmap;
        } finally {
            ufuVar.q();
        }
    }

    public final Bitmap b(Context context, Uri uri, int i, int i2, int i3, boolean z) {
        ufu ufuVar = (ufu) this.d.a(c(uri, i, i2, i3, z).f(context));
        if (ufuVar != null) {
            try {
                return ufuVar.d();
            } catch (uft unused) {
                alvw i4 = b.i();
                i4.X(alwp.a, "Bugle");
                ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapSync", 79, "AvatarImageUtil.java")).q("Could not retrieve avatar image bitmap from image type.");
                return null;
            }
        }
        return null;
    }

    public final ufs c(Uri uri, int i, int i2, int i3, boolean z) {
        if (!Objects.equals(xvc.j(uri), "s") && !xvc.p(this.c, uri)) {
            return new ugi(uri, i, i2, true, z, i3);
        }
        return new ufd(this.e, uri, i, i2, z);
    }

    public final Bitmap d(Context context, Uri uri, int i, int i2) {
        Bitmap bitmap = null;
        if (!ydk.B(uri)) {
            return null;
        }
        ugd ugdVar = new ugd(context, new ugi(uri, i, i2, true, false, 0));
        ugdVar.f = 0;
        ufu ufuVar = (ufu) this.d.a(ugdVar);
        try {
            if (ufuVar != null) {
                try {
                    try {
                        Bitmap d = ufuVar.d();
                        d.getClass();
                        bitmap = yfo.d(d);
                    } catch (OutOfMemoryError unused) {
                        alvw i3 = b.i();
                        i3.X(alwp.a, "Bugle");
                        ((alvg) ((alvg) i3).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getRemoteAvatarBitmap", 156, "AvatarImageUtil.java")).q("OOM creating avatarBitmap from remote URI ");
                    }
                } catch (uft unused2) {
                    alvw i4 = b.i();
                    i4.X(alwp.a, "Bugle");
                    ((alvg) ((alvg) i4).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getRemoteAvatarBitmap", 158, "AvatarImageUtil.java")).q("Could not get bitmap from image type for remote URI");
                }
            }
            return bitmap;
        } finally {
            ufuVar.q();
        }
    }
}
