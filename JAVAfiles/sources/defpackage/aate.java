package defpackage;

import android.database.Cursor;
import android.net.Uri;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aate extends aatc {
    public String a;
    public final long b;
    public final Uri d;
    public int e;
    public int f;

    public aate(Cursor cursor) {
        super(1);
        this.d = rvt.b(cursor);
        this.e = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        int i = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        this.f = i;
        if (this.e <= 0) {
            this.e = -1;
        }
        if (i <= 0) {
            this.f = -1;
        }
        int i2 = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
        if (i2 == 90 || i2 == 270) {
            int i3 = this.e;
            this.e = this.f;
            this.f = i3;
        }
        this.a = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        this.b = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
    }

    @Override // defpackage.aatc
    public final int a() {
        return this.d.hashCode();
    }

    public abstract GalleryContent b(ameb amebVar);

    @Deprecated
    public abstract GalleryContentItem c(ameb amebVar);

    @Override // defpackage.aatc
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof aate)) {
            return false;
        }
        aate aateVar = (aate) obj;
        if (super.equals(obj) && Objects.equals(this.a, aateVar.a) && this.b == aateVar.b && Objects.equals(this.d, aateVar.d) && this.f == aateVar.f && this.e == aateVar.e) {
            return true;
        }
        return false;
    }

    @Override // defpackage.aatc
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.c), this.a, Long.valueOf(this.b), this.d, Integer.valueOf(this.f), Integer.valueOf(this.e));
    }
}
