package defpackage;

import android.content.ContentResolver;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hsn implements hsf, hso {
    private final ContentResolver a;
    private final /* synthetic */ int b;

    public hsn(ContentResolver contentResolver, int i) {
        this.b = i;
        this.a = contentResolver;
    }

    @Override // defpackage.hso
    public final hns a(Uri uri) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new hoh(this.a, uri);
            }
            return new hno(this.a, uri);
        }
        return new hoa(this.a, uri);
    }

    @Override // defpackage.hsf
    public final hse b(hsj hsjVar) {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return new hsp(this);
            }
            return new hsp(this);
        }
        return new hsp(this);
    }
}
