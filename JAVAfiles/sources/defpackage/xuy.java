package defpackage;

import android.graphics.Bitmap;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xuy extends xvi implements xvb {
    private static final alwo a = alwo.o("BugleImage");

    /* compiled from: PG */
    /* loaded from: classes3.dex */
    public interface a {
        xvc Oi();

        xwg Oj();

        xwx fY();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.graphics.Bitmap c(android.net.Uri r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuy.c(android.net.Uri, int, int):android.graphics.Bitmap");
    }

    @Override // defpackage.xvb
    public final Bitmap a(int i, int i2, int i3) {
        OutOfMemoryError e;
        Bitmap bitmap;
        try {
            bitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        } catch (OutOfMemoryError e2) {
            e = e2;
            bitmap = null;
        }
        try {
            bitmap.eraseColor(i3);
        } catch (OutOfMemoryError e3) {
            e = e3;
            ((alwl) ((alwl) ((alwl) a.i()).g(e)).h("com/google/android/apps/messaging/shared/ui/avatar/AvatarContentProvider$AvatarContentProviderInner", "createOrReuseBitmap", (char) 388, "AvatarContentProvider.java")).q("Error while creating bitmap");
            ((a) yyb.aL(a.class)).Oj().a(15, 1);
            return bitmap;
        }
        return bitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ff  */
    @Override // defpackage.xvi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final android.graphics.Bitmap b(android.net.Uri r29) {
        /*
            Method dump skipped, instructions count: 527
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xuy.b(android.net.Uri):android.graphics.Bitmap");
    }
}
