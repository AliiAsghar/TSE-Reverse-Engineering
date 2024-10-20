package com.google.android.apps.messaging.ui.mediapicker.c2o.content;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import defpackage.aand;
import defpackage.aapd;
import defpackage.aapv;
import defpackage.aapw;
import defpackage.aarm;
import defpackage.ahjj;
import defpackage.ajgi;
import defpackage.imt;
import defpackage.imv;
import defpackage.imx;
import defpackage.rsm;
import defpackage.rsr;
import defpackage.tqj;
import defpackage.vof;
import defpackage.ytt;
import defpackage.zhh;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class AttachmentQueueState implements Parcelable, rsm {
    public static final Parcelable.Creator<AttachmentQueueState> CREATOR = new aapv(0);
    public List a;
    public ahjj b;
    private final List c;
    private int d;
    private final MessagePartDataConverter e;

    public AttachmentQueueState(Parcel parcel) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        ArrayList readArrayList = parcel.readArrayList(MediaContentItem.class.getClassLoader());
        if (readArrayList != null) {
            this.a = readArrayList;
        }
        this.d = parcel.readInt();
        this.e = (MessagePartDataConverter) parcel.readParcelable(MessagePartDataConverter.class.getClassLoader());
    }

    public static boolean i(MediaContentItem mediaContentItem) {
        if ((mediaContentItem instanceof GalleryContentItem) && ((GalleryContentItem) mediaContentItem).f.equals(tqj.GOOGLE_PHOTOS_LINK)) {
            return true;
        }
        return false;
    }

    private static MediaContentItem p(imv imvVar) {
        if (imvVar instanceof imx) {
            imx imxVar = (imx) imvVar;
            return new ExpressiveStickerContentItem(imxVar.b, imxVar.a, imxVar.d.getWidth(), imxVar.d.getHeight(), imxVar.e, imxVar.c);
        }
        if (imvVar instanceof imt) {
            imt imtVar = (imt) imvVar;
            return new CameraContentItem(imtVar.b, imtVar.a, imtVar.d.getWidth(), imtVar.d.getHeight(), ((Long) imtVar.e.orElse(-1L)).longValue(), imtVar.c, imtVar.f, imtVar.g);
        }
        if (imvVar instanceof GalleryContent) {
            GalleryContent galleryContent = (GalleryContent) imvVar;
            return new GalleryContentItem(galleryContent.d(), galleryContent.j(), galleryContent.e().getWidth(), galleryContent.e().getHeight(), ((Long) galleryContent.h().orElse(-1L)).longValue(), galleryContent.g(), galleryContent.a(), galleryContent.f());
        }
        return null;
    }

    private final void q(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MediaContentItem a = this.e.a((MessagePartCoreData) it.next());
            if (a != null) {
                int indexOf = this.a.indexOf(a);
                if (indexOf >= 0) {
                    arrayList.add((MediaContentItem) this.a.get(indexOf));
                } else {
                    arrayList.add(a);
                }
            }
        }
        this.a = arrayList;
    }

    public final int a(Class cls) {
        Iterator it = this.a.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (cls.isInstance((MediaContentItem) it.next())) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.rsm
    public final void ai(rsr rsrVar, int i) {
        if ((i & 1) == 1) {
            if (((Boolean) aapd.a.e()).booleanValue() || rsrVar.u.size() != this.a.size()) {
                this.d = rsrVar.l();
                q(rsrVar.u);
                g();
            }
        }
    }

    public final int b(imv imvVar) {
        MediaContentItem p = p(imvVar);
        p.getClass();
        return this.a.indexOf(p);
    }

    @Deprecated
    public final int c(MediaContentItem mediaContentItem) {
        return this.a.indexOf(mediaContentItem);
    }

    public final List d(AttachmentQueueState attachmentQueueState) {
        ArrayList arrayList = new ArrayList();
        for (MediaContentItem mediaContentItem : this.a) {
            if (!attachmentQueueState.a.contains(mediaContentItem)) {
                arrayList.add(mediaContentItem);
            }
        }
        return arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List e(AttachmentQueueState attachmentQueueState) {
        return (List) Collection.EL.stream(d(attachmentQueueState)).filter(new ytt(18)).map(new aand(3)).collect(Collectors.toCollection(new zhh(11)));
    }

    public final void f(aapw aapwVar) {
        this.c.add(aapwVar);
    }

    public final void g() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aapw) it.next()).d(this);
        }
    }

    public final boolean h(imv imvVar) {
        return o(imvVar);
    }

    public final boolean j(imv imvVar) {
        if (b(imvVar) != -1) {
            return true;
        }
        return false;
    }

    @Deprecated
    public final boolean k(MediaContentItem mediaContentItem) {
        if (c(mediaContentItem) != -1) {
            return true;
        }
        return false;
    }

    public final boolean l(imv imvVar) {
        MediaContentItem p = p(imvVar);
        p.getClass();
        return m(p);
    }

    @Deprecated
    public final boolean m(MediaContentItem mediaContentItem) {
        if (this.a.indexOf(mediaContentItem) >= 0) {
            this.a.remove(mediaContentItem);
            g();
            return true;
        }
        return false;
    }

    @Deprecated
    public final boolean n(MediaContentItem mediaContentItem) {
        if (!((Boolean) vof.a.e()).booleanValue() ? this.a.size() >= this.d : !(i(mediaContentItem) || ((int) Collection.EL.stream(this.a).filter(new ytt(16)).count()) < this.d)) {
            ahjj ahjjVar = this.b;
            if (ahjjVar != null) {
                ajgi ajgiVar = new ajgi(((aarm) ahjjVar.a).j);
                ajgiVar.x(R.string.mms_attachment_limit_reached);
                ajgiVar.m(R.string.attachment_limit_reached_dialog_message_when_composing);
                ajgiVar.t(android.R.string.ok, null);
                ajgiVar.a();
                return false;
            }
            return false;
        }
        this.a.add(mediaContentItem);
        g();
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((aapw) it.next()).h();
        }
        return true;
    }

    public final boolean o(imv imvVar) {
        MediaContentItem p = p(imvVar);
        p.getClass();
        return n(p);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.a);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
    }

    public AttachmentQueueState(rsr rsrVar, MessagePartDataConverter messagePartDataConverter) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.e = messagePartDataConverter;
        this.d = rsrVar.l();
        q(rsrVar.u);
    }

    public AttachmentQueueState(MessagePartDataConverter messagePartDataConverter) {
        this.a = new ArrayList();
        this.c = new ArrayList();
        this.e = messagePartDataConverter;
        this.a = new ArrayList();
        this.d = 10;
    }

    @Override // defpackage.rsm
    public final void ah() {
    }

    @Override // defpackage.rsm
    public final void al(rsr rsrVar) {
    }

    @Override // defpackage.rsm
    public final void bp(rsr rsrVar) {
    }
}
