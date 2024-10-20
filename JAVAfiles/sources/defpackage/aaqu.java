package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaqu {
    public final cg a;
    public final AttachmentQueueState b;
    public final aapk c;
    public final aabz d;
    public final int e;
    public final aabp f;
    public final ContentGridView g;
    private final rre h;
    private final aaqt i;
    private final aapf j;

    public aaqu() {
        throw null;
    }

    public final boolean equals(Object obj) {
        aabp aabpVar;
        aaqt aaqtVar;
        aapf aapfVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof aaqu) {
            aaqu aaquVar = (aaqu) obj;
            if (this.a.equals(aaquVar.a) && this.b.equals(aaquVar.b) && ((aabpVar = this.f) != null ? aabpVar.equals(aaquVar.f) : aaquVar.f == null) && this.g.equals(aaquVar.g) && this.c.equals(aaquVar.c) && this.h.equals(aaquVar.h) && ((aaqtVar = this.i) != null ? aaqtVar.equals(aaquVar.i) : aaquVar.i == null) && ((aapfVar = this.j) != null ? aapfVar.equals(aaquVar.j) : aaquVar.j == null) && this.d.equals(aaquVar.d) && this.e == aaquVar.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
        aabp aabpVar = this.f;
        int i = 0;
        if (aabpVar == null) {
            hashCode = 0;
        } else {
            hashCode = aabpVar.hashCode();
        }
        int hashCode4 = ((((((((hashCode3 * 1000003) ^ hashCode) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003;
        aaqt aaqtVar = this.i;
        if (aaqtVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = aaqtVar.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        aapf aapfVar = this.j;
        if (aapfVar != null) {
            i = aapfVar.hashCode();
        }
        return ((((i2 ^ i) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e;
    }

    public final String toString() {
        aabz aabzVar = this.d;
        aapf aapfVar = this.j;
        aaqt aaqtVar = this.i;
        rre rreVar = this.h;
        aapk aapkVar = this.c;
        ContentGridView contentGridView = this.g;
        aabp aabpVar = this.f;
        AttachmentQueueState attachmentQueueState = this.b;
        return "CategoryParameters{fragment=" + this.a.toString() + ", attachmentQueueState=" + attachmentQueueState.toString() + ", conversationInputBase=" + String.valueOf(aabpVar) + ", contentGridView=" + String.valueOf(contentGridView) + ", compose2oIntentLauncher=" + aapkVar.toString() + ", draftDataModel=" + rreVar.toString() + ", categoryOrganizer=" + String.valueOf(aaqtVar) + ", contentCategoryHost=" + String.valueOf(aapfVar) + ", conversationInputHost=" + aabzVar.toString() + ", categoryIndex=" + this.e + "}";
    }

    public aaqu(cg cgVar, AttachmentQueueState attachmentQueueState, aabp aabpVar, ContentGridView contentGridView, aapk aapkVar, rre rreVar, aaqt aaqtVar, aapf aapfVar, aabz aabzVar, int i) {
        this.a = cgVar;
        this.b = attachmentQueueState;
        this.f = aabpVar;
        if (contentGridView == null) {
            throw new NullPointerException("Null contentGridView");
        }
        this.g = contentGridView;
        if (aapkVar != null) {
            this.c = aapkVar;
            this.h = rreVar;
            this.i = aaqtVar;
            this.j = aapfVar;
            this.d = aabzVar;
            this.e = i;
            return;
        }
        throw new NullPointerException("Null compose2oIntentLauncher");
    }
}
