package defpackage;

import android.text.InputFilter;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.conversation.message.MessageMetadataDetailsView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.wearable.WearableBindService;
import j$.util.Objects;
import j$.util.function.Predicate$CC;
import java.util.function.Predicate;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ytt implements Predicate {
    private final /* synthetic */ int a;

    public /* synthetic */ ytt(int i) {
        this.a = i;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            case 1:
                return Predicate$CC.$default$and(this, predicate);
            case 2:
                return Predicate$CC.$default$and(this, predicate);
            case 3:
                return Predicate$CC.$default$and(this, predicate);
            case 4:
                return Predicate$CC.$default$and(this, predicate);
            case 5:
                return Predicate$CC.$default$and(this, predicate);
            case 6:
                return Predicate$CC.$default$and(this, predicate);
            case 7:
                return Predicate$CC.$default$and(this, predicate);
            case 8:
                return Predicate$CC.$default$and(this, predicate);
            case 9:
                return Predicate$CC.$default$and(this, predicate);
            case 10:
                return Predicate$CC.$default$and(this, predicate);
            case 11:
                return Predicate$CC.$default$and(this, predicate);
            case 12:
                return Predicate$CC.$default$and(this, predicate);
            case 13:
                return Predicate$CC.$default$and(this, predicate);
            case 14:
                return Predicate$CC.$default$and(this, predicate);
            case 15:
                return Predicate$CC.$default$and(this, predicate);
            case 16:
                return Predicate$CC.$default$and(this, predicate);
            case 17:
                return Predicate$CC.$default$and(this, predicate);
            case 18:
                return Predicate$CC.$default$and(this, predicate);
            case 19:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    /* renamed from: negate */
    public final /* synthetic */ Predicate mo407negate() {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            case 1:
                return Predicate$CC.$default$negate(this);
            case 2:
                return Predicate$CC.$default$negate(this);
            case 3:
                return Predicate$CC.$default$negate(this);
            case 4:
                return Predicate$CC.$default$negate(this);
            case 5:
                return Predicate$CC.$default$negate(this);
            case 6:
                return Predicate$CC.$default$negate(this);
            case 7:
                return Predicate$CC.$default$negate(this);
            case 8:
                return Predicate$CC.$default$negate(this);
            case 9:
                return Predicate$CC.$default$negate(this);
            case 10:
                return Predicate$CC.$default$negate(this);
            case 11:
                return Predicate$CC.$default$negate(this);
            case 12:
                return Predicate$CC.$default$negate(this);
            case 13:
                return Predicate$CC.$default$negate(this);
            case 14:
                return Predicate$CC.$default$negate(this);
            case 15:
                return Predicate$CC.$default$negate(this);
            case 16:
                return Predicate$CC.$default$negate(this);
            case 17:
                return Predicate$CC.$default$negate(this);
            case 18:
                return Predicate$CC.$default$negate(this);
            case 19:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            case 1:
                return Predicate$CC.$default$or(this, predicate);
            case 2:
                return Predicate$CC.$default$or(this, predicate);
            case 3:
                return Predicate$CC.$default$or(this, predicate);
            case 4:
                return Predicate$CC.$default$or(this, predicate);
            case 5:
                return Predicate$CC.$default$or(this, predicate);
            case 6:
                return Predicate$CC.$default$or(this, predicate);
            case 7:
                return Predicate$CC.$default$or(this, predicate);
            case 8:
                return Predicate$CC.$default$or(this, predicate);
            case 9:
                return Predicate$CC.$default$or(this, predicate);
            case 10:
                return Predicate$CC.$default$or(this, predicate);
            case 11:
                return Predicate$CC.$default$or(this, predicate);
            case 12:
                return Predicate$CC.$default$or(this, predicate);
            case 13:
                return Predicate$CC.$default$or(this, predicate);
            case 14:
                return Predicate$CC.$default$or(this, predicate);
            case 15:
                return Predicate$CC.$default$or(this, predicate);
            case 16:
                return Predicate$CC.$default$or(this, predicate);
            case 17:
                return Predicate$CC.$default$or(this, predicate);
            case 18:
                return Predicate$CC.$default$or(this, predicate);
            case 19:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.a) {
            case 0:
                return Objects.nonNull((Boolean) obj);
            case 1:
                return d.an((String) obj);
            case 2:
                return ((Boolean) obj).booleanValue();
            case 3:
                alnr alnrVar = yul.a;
                if (((yub) obj).b.size() <= 0) {
                    return false;
                }
                return true;
            case 4:
                qel qelVar = yxm.a;
                if (((MessagePartCoreData) obj).t() == null) {
                    return false;
                }
                return true;
            case 5:
                return d.an((String) obj);
            case 6:
                return ((wjd) obj).m;
            case 7:
                return true;
            case 8:
                return Objects.nonNull((afvq) obj);
            case 9:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                if (messagePartCoreData.t() == null && messagePartCoreData.v() == null) {
                    return false;
                }
                return true;
            case 10:
                if (((MessagePartCoreData) obj).H() == tqj.GOOGLE_PHOTOS_LINK) {
                    return false;
                }
                return true;
            case 11:
                return gh.u((String) obj);
            case 12:
                xze xzeVar = zri.a;
                return ((InputFilter) obj) instanceof InputFilter.LengthFilter;
            case 13:
                if (albo.ah((String) obj)) {
                    return false;
                }
                return true;
            case 14:
                return yyb.bC((MessagePartCoreData) obj);
            case 15:
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) obj;
                int i = MessageMetadataDetailsView.t;
                if (!gh.m(messagePartCoreData2.U()) && !gh.i(messagePartCoreData2.U()) && !gh.z(messagePartCoreData2.U())) {
                    return false;
                }
                return true;
            case 16:
                if (AttachmentQueueState.i((MediaContentItem) obj)) {
                    return false;
                }
                return true;
            case 17:
                if (((MediaContentItem) obj) instanceof GalleryContentItem) {
                    return false;
                }
                return true;
            case 18:
                return ((MediaContentItem) obj) instanceof GalleryContentItem;
            case 19:
                alwo alwoVar = WearableBindService.a;
                String path = ((ackb) obj).b().a().getPath();
                if (!Objects.equals(path, "/bugle/watch_version/") && !Objects.equals(path, "/bugle/attachments/")) {
                    return false;
                }
                return true;
            default:
                acox acoxVar = (acox) obj;
                if (!acoxVar.c.equals(acoy.PENDING) && (!((Boolean) acon.a.a()).booleanValue() || !acoxVar.c.equals(acoy.DISCONNECTED) || !acoxVar.f.equals(acow.FAILED))) {
                    return false;
                }
                return true;
        }
    }
}
