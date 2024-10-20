package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ipi implements afkt, ioq {
    private final mci c;
    private final Supplier d;
    private final cj e;
    private final sb f;
    private final lbf g;
    private final afvr h;
    private final kor i;
    private final ifb j;
    private static final List b = aqjn.B(ameb.GALLERY_CHOOSER, ameb.GALLERY_LIBRARY, ameb.DEVICE_CAMERA_APP, ameb.CAMERA, ameb.MINI_CAMERA, ameb.FULLSCREEN_CAMERA);
    public static final arml a = armd.a(ipf.a);

    public ipi(Activity activity, ifb ifbVar, kor korVar, mci mciVar, kor korVar2, Supplier supplier) {
        this.j = ifbVar;
        this.i = korVar;
        this.c = mciVar;
        this.d = supplier;
        this.g = (lbf) korVar.c().orElse(null);
        this.h = (afvr) korVar2.c().orElse(null);
        if (activity instanceof cj) {
            cj cjVar = (cj) activity;
            this.e = cjVar;
            this.f = cjVar.g;
            return;
        }
        throw new IllegalStateException("Check failed.");
    }

    static /* synthetic */ MessagePartCoreData f(ipi ipiVar, afto aftoVar, boolean z, Uri uri, String str, Enum r7, int i) {
        boolean z2;
        tqj tqjVar;
        int i2 = i & 2;
        afcp afcpVar = aftoVar.g;
        if (i2 != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z & z2) {
            if (afcpVar instanceof afgh) {
                if ((i & 4) != 0) {
                    uri = null;
                }
                ifb ifbVar = ipiVar.j;
                ims n = imt.n();
                if (uri == null) {
                    uri = Uri.parse(aftoVar.b);
                }
                if ((i & 8) != 0) {
                    str = null;
                }
                n.g(uri);
                if (str == null) {
                    str = afwv.L(aftoVar.a).a();
                }
                n.d(str);
                n.a = new Size(aftoVar.d, aftoVar.e);
                n.c(imn.a(afcpVar));
                n.f(aftoVar.f.toEpochMilli());
                n.b(ipq.f((afgh) afcpVar, 2));
                return ifbVar.d(n.a(), ipq.b());
            }
            throw new IllegalStateException("Check failed.");
        }
        if ((i & 16) != 0) {
            r7 = null;
        }
        ifb ifbVar2 = ipiVar.j;
        String str2 = aftoVar.b;
        imz n2 = GalleryContent.n();
        n2.g(Uri.parse(str2));
        n2.c(afwv.L(aftoVar.a).a());
        n2.a = new Size(aftoVar.d, aftoVar.e);
        n2.b(imn.a(afcpVar));
        n2.e(aftoVar.f.toEpochMilli());
        if (r7 == afvs.a) {
            tqjVar = tqj.GOOGLE_PHOTOS_LINK;
        } else {
            tqjVar = tqj.STANDARD;
        }
        n2.f(tqjVar);
        return ifbVar2.d(n2.a(), ipq.b());
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ Object a(afcq afcqVar, arpe arpeVar) {
        View findViewById;
        afto aftoVar = (afto) afcqVar;
        afcp afcpVar = aftoVar.g;
        if (afcpVar instanceof afgh) {
            afgh afghVar = (afgh) afcpVar;
            int i = 1;
            efu efuVar = null;
            if (afghVar.d == 1) {
                Integer num = afghVar.b;
                if (num != null && (findViewById = this.e.findViewById(num.intValue())) != null) {
                    efuVar = efu.l(findViewById, findViewById.getWidth(), findViewById.getHeight());
                }
                rw a2 = this.f.a("compose_media_viewer", new sl(), new afhb(this, aftoVar, i));
                Intent putExtra = new Intent(this.e, (Class<?>) MediaViewerActivity.class).setFlags(536870912).putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, Uri.parse(aftoVar.b)).putExtra("opening_source", 6);
                aawz e = MediaViewerButton.e();
                e.e(R.string.camera_attach_media);
                e.d(R.drawable.quantum_ic_check_white_24);
                e.b(R.string.camera_attach_media_description);
                e.c(new MediaViewerPrimaryButtonEvent());
                Intent putExtra2 = putExtra.putExtra("primary_button", e.a());
                aawz e2 = MediaViewerButton.e();
                e2.b(R.string.media_viewer_save_media_description);
                e2.d(R.drawable.quantum_ic_save_alt_white_24);
                e2.c(new MediaViewerSaveButtonEvent());
                Intent putExtra3 = putExtra2.putParcelableArrayListExtra("secondary_button_list", new ArrayList<>(aqjn.y(e2.a()))).putExtra("media_editor_type", 1).putExtra("content_type", afwv.L(aftoVar.a).a());
                Object e3 = aaxj.c.e();
                e3.getClass();
                Intent putExtra4 = putExtra3.putExtra("open_in_editor", ((Boolean) e3).booleanValue());
                putExtra4.getClass();
                a2.b(putExtra4, efuVar);
                return afky.a;
            }
            return g(aftoVar, null, null);
        }
        if (!(afcpVar instanceof afgi) && !(afcpVar instanceof afgg) && !(afcpVar instanceof afct)) {
            Objects.toString(afcpVar);
            throw new IllegalStateException("Invalid AttachmentSource: ".concat(afcpVar.toString()));
        }
        return e(aftoVar, arpeVar);
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void c(afcq afcqVar) {
        ((afto) afcqVar).getClass();
    }

    @Override // defpackage.afkt
    public final /* bridge */ /* synthetic */ void d(afcq afcqVar) {
        Object obj;
        afto aftoVar = (afto) afcqVar;
        MessagePartCoreData f = f(this, aftoVar, false, null, null, null, 30);
        obj = this.d.get();
        ((inq) obj).h(f(this, aftoVar, false, null, null, null, 30));
        this.c.g(f.N());
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r9 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(defpackage.afto r8, defpackage.arpe r9) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ipi.e(afto, arpe):java.lang.Object");
    }

    public final aeke g(afto aftoVar, Uri uri, String str) {
        Object obj;
        Supplier supplier = this.d;
        MessagePartCoreData f = f(this, aftoVar, true, uri, str, null, 16);
        obj = supplier.get();
        int c = ((inq) obj).c(f);
        if (c < 0) {
            return new afkz(new ioo(aftoVar));
        }
        this.c.f(f.N(), c);
        return afky.a;
    }

    @Override // defpackage.ioq
    public final /* synthetic */ arqr h() {
        return iph.a;
    }

    @Override // defpackage.ioq
    public final boolean i(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        if (messagePartCoreData.bk() && b.contains(messagePartCoreData.M())) {
            return true;
        }
        return false;
    }

    @Override // defpackage.afkt
    public final /* synthetic */ void b() {
    }
}
