package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aaun extends aapz {
    public final AttachmentQueueState A;
    private final aapw f;

    /* JADX INFO: Access modifiers changed from: protected */
    public aaun(aaqh aaqhVar, AttachmentQueueState attachmentQueueState, aaqa aaqaVar, ContentGridView contentGridView, int i) {
        super(aaqhVar, aaqaVar, contentGridView, i);
        aaum aaumVar = new aaum(this, 0);
        this.f = aaumVar;
        this.A = attachmentQueueState;
        attachmentQueueState.f(aaumVar);
    }

    protected abstract amqh i();

    protected abstract amqi j();

    public final void v(imv imvVar, boolean z, int i) {
        aapu aapuVar;
        if (z) {
            AttachmentQueueState attachmentQueueState = this.A;
            attachmentQueueState.getClass();
            attachmentQueueState.o(imvVar);
            aapu aapuVar2 = this.a;
            if (aapuVar2 != null) {
                aapuVar2.f(imvVar, aauj.a(i(), j()), i);
                return;
            }
            return;
        }
        AttachmentQueueState attachmentQueueState2 = this.A;
        attachmentQueueState2.getClass();
        if (attachmentQueueState2.l(imvVar) && (aapuVar = this.a) != null) {
            aapuVar.c(imvVar, aauj.a(i(), j()), i);
        }
    }

    @Deprecated
    public final void w(MediaContentItem mediaContentItem, boolean z, int i) {
        aapu aapuVar;
        if (z) {
            AttachmentQueueState attachmentQueueState = this.A;
            attachmentQueueState.getClass();
            attachmentQueueState.n(mediaContentItem);
            aapu aapuVar2 = this.a;
            if (aapuVar2 != null) {
                aapuVar2.h(mediaContentItem, aauj.a(i(), j()), i);
                return;
            }
            return;
        }
        AttachmentQueueState attachmentQueueState2 = this.A;
        attachmentQueueState2.getClass();
        if (attachmentQueueState2.m(mediaContentItem) && (aapuVar = this.a) != null) {
            aapuVar.d(mediaContentItem, aauj.a(i(), j()), i);
        }
    }
}
