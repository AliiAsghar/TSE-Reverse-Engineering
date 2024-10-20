package defpackage;

import android.content.DialogInterface;
import com.google.android.libraries.stickers.gallery.StickerGalleryActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aatr implements DialogInterface.OnCancelListener {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aatr(arpe arpeVar, int i) {
        this.b = i;
        this.a = arpeVar;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, arpe] */
    /* JADX WARN: Type inference failed for: r2v5, types: [arvo, java.lang.Object] */
    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    this.a.h(null);
                    return;
                } else {
                    ((StickerGalleryActivity) this.a).finish();
                    return;
                }
            }
            this.a.w(0);
            return;
        }
        ((aats) this.a).e(amqd.UNKNOWN_CLOSING_SOURCE);
    }

    public /* synthetic */ aatr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }
}
