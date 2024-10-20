package defpackage;

import android.database.Cursor;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatd extends aate {
    public aatd(Cursor cursor) {
        super(cursor);
    }

    @Override // defpackage.aate
    public final GalleryContent b(ameb amebVar) {
        imz n = GalleryContent.n();
        n.g(this.d);
        n.c(this.a);
        n.a = new Size(this.e, this.f);
        n.b(amebVar);
        n.e(this.b);
        return n.a();
    }

    @Override // defpackage.aate
    public final GalleryContentItem c(ameb amebVar) {
        return new GalleryContentItem(this.d, this.a, this.e, this.f, -1L, amebVar, this.b);
    }

    @Override // defpackage.aate, defpackage.aatc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aatd)) {
            return false;
        }
        return super.equals(obj);
    }
}
