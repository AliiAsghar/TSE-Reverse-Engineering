package defpackage;

import android.content.ContentUris;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aatf extends aate {
    public final long g;

    public aatf(Context context, ydk ydkVar, Cursor cursor) {
        super(cursor);
        String string;
        String p;
        this.g = cursor.getLong(cursor.getColumnIndexOrThrow("duration"));
        if (((Boolean) rvs.a.e()).booleanValue()) {
            string = ContentUris.withAppendedId(rvt.b, cursor.getLong(cursor.getColumnIndexOrThrow("_id"))).getPath();
        } else {
            string = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
        }
        if (string != null && (p = ydk.p(context, Uri.parse(string))) != null && !ydkVar.r(p)) {
            this.a = p;
        }
    }

    @Override // defpackage.aate
    public final GalleryContent b(ameb amebVar) {
        imz n = GalleryContent.n();
        n.g(this.d);
        n.c(this.a);
        n.a = new Size(this.e, this.f);
        n.b(amebVar);
        n.e(this.b);
        long j = this.g;
        if (j > 0) {
            n.d(j);
        }
        return n.a();
    }

    @Override // defpackage.aate
    public final GalleryContentItem c(ameb amebVar) {
        return new GalleryContentItem(this.d, this.a, this.e, this.f, this.g, amebVar, this.b);
    }

    @Override // defpackage.aate, defpackage.aatc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aatf)) {
            return false;
        }
        aatf aatfVar = (aatf) obj;
        if (super.equals(obj) && this.g == aatfVar.g) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aate, defpackage.aatc
    public final int hashCode() {
        return Objects.hash(Integer.valueOf(super.hashCode()), Long.valueOf(this.g));
    }
}
