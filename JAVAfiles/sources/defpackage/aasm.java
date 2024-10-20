package defpackage;

import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryContentItemView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasm extends aaun {
    public static final xze f = xze.g("Bugle", "GalleryCategoryPresenter");
    private final inx B;
    private final akms C;
    private final anen D;
    private final armf E;
    private final aabz F;
    private int G;
    private final kor H;
    private final kor I;
    public final Context g;
    public final xnv h;
    public final yjf i;
    public final armf j;
    public final aatq k;
    public final aapk l;
    public final ksi m;
    public final List n;
    public final List o;
    public final anen p;
    public final abbu q;
    public final ibs r;
    public final cg s;
    public Uri t;
    public String u;
    public File v;
    final long w;
    final alhr x;
    akul y;
    public Function z;

    public aasm(Context context, inx inxVar, xnv xnvVar, ksi ksiVar, yjf yjfVar, armf armfVar, anen anenVar, anen anenVar2, abbu abbuVar, ibs ibsVar, kor korVar, kor korVar2, armf armfVar2, cg cgVar, aatq aatqVar, AttachmentQueueState attachmentQueueState, aaqa aaqaVar, aapk aapkVar, aabz aabzVar, ContentGridView contentGridView, int i, long j, alhr alhrVar) {
        super(aatqVar, attachmentQueueState, aaqaVar, contentGridView, i);
        this.g = context;
        this.B = inxVar;
        this.h = xnvVar;
        this.m = ksiVar;
        this.i = yjfVar;
        this.j = armfVar;
        this.l = aapkVar;
        this.k = aatqVar;
        this.D = anenVar;
        this.p = anenVar2;
        this.q = abbuVar;
        this.r = ibsVar;
        this.H = korVar;
        this.w = j;
        this.x = alhrVar;
        this.I = korVar2;
        this.E = armfVar2;
        this.s = cgVar;
        this.F = aabzVar;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.C = aktp.x(context).c().b(hxc.a()).o(huz.b());
        if (korVar2.c().isPresent() && ((Boolean) utw.o.e()).booleanValue()) {
            aktp.H(cgVar, lbk.class, new akvz() { // from class: aask
                @Override // defpackage.akvz
                public final akwa a(akvv akvvVar) {
                    throw null;
                }
            });
        }
    }

    private final void x() {
        this.t = null;
        this.G = 0;
        this.u = null;
    }

    private final void y(int i) {
        String str;
        String str2;
        this.G = i;
        if (i == 2) {
            str = "video/mp4";
        } else {
            str = "image/jpeg";
        }
        this.u = str;
        ListenableFuture submit = this.D.submit(new ijt(this, i, 11));
        if (i == 1) {
            str2 = "android.media.action.IMAGE_CAPTURE";
        } else {
            str2 = "android.media.action.VIDEO_CAPTURE";
        }
        albo.bR(submit, qjc.a(new ydv(new zcd(this, str2, 18), new aabj(20), 0)), this.p);
    }

    @Override // defpackage.aapz
    public final int b(int i) {
        return this.k.b(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapz
    public final long c(int i, int i2) {
        return this.k.d(i, i2);
    }

    @Override // defpackage.aapz
    public final void d(aaqi aaqiVar, int i) {
        super.d(aaqiVar, i);
        this.k.g(aaqiVar, i, this.A, this.C);
    }

    @Override // defpackage.aapz
    protected final void f(aaqi aaqiVar, int i) {
        ahqq ahqqVar;
        int a = aaqiVar.a();
        if (a != 2) {
            if (a != 3) {
                if (a != 7) {
                    if (a != 8) {
                        if (a != 12) {
                            GalleryContentItemView galleryContentItemView = (GalleryContentItemView) aaqiVar;
                            if (!u(galleryContentItemView.h, galleryContentItemView.k)) {
                                boolean z = galleryContentItemView.k;
                                boolean z2 = !z;
                                if (!z) {
                                    ahqqVar = ((mgv) this.E.b()).a();
                                } else {
                                    ahqqVar = null;
                                }
                                q((GalleryContent) galleryContentItemView.h, (GalleryContentItem) galleryContentItemView.g, z2, i);
                                if (ahqqVar != null) {
                                    ((mgv) this.E.b()).h(ahqqVar, mgv.C);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        o();
                        return;
                    }
                    this.l.j(this.B.a(), amqe.EXPAND, this.A);
                    return;
                }
                this.l.i(amqe.EXPAND);
                return;
            }
            t(amqe.EXPAND);
            return;
        }
        r();
    }

    @Override // defpackage.aapz, defpackage.aaqe
    public final void g() {
        p();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h() {
        return this.k.c();
    }

    @Override // defpackage.aaun
    protected final amqh i() {
        aatq aatqVar = this.k;
        aatqVar.getClass();
        return aatqVar.e();
    }

    @Override // defpackage.aaun
    protected final amqi j() {
        aatq aatqVar = this.k;
        aatqVar.getClass();
        return aatqVar.f();
    }

    public final void k() {
        File file = this.v;
        if (file != null && file.exists()) {
            try {
                if (!this.v.delete()) {
                    xzb.g("Bugle", "GalleryCategoryPresenter: Failed to delete the shared image file");
                }
                x();
            } catch (Throwable th) {
                xzb.g("Bugle", "GalleryCategoryPresenter: Failed to delete the shared image file");
                x();
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l() {
        String path;
        Uri uri = this.t;
        if (uri != null && this.G != 0 && (path = uri.getPath()) != null) {
            String ag = albo.ag(this.u);
            if (((Boolean) utw.o.e()).booleanValue()) {
                List list = this.o;
                imz n = GalleryContent.n();
                n.g(uri);
                n.c(ag);
                n.a = new Size(-1, -1);
                n.b(ameb.DEVICE_CAMERA_APP);
                n.e(TimeUnit.MILLISECONDS.toSeconds(this.h.f().toEpochMilli()));
                list.add(n.a());
            }
            this.n.add(new GalleryContentItem(uri, ag, -1, -1, ameb.DEVICE_CAMERA_APP, TimeUnit.MILLISECONDS.toSeconds(this.h.f().toEpochMilli())));
            MediaScannerConnection.scanFile(this.g, new String[]{path}, new String[]{ag}, new MediaScannerConnection.OnScanCompletedListener() { // from class: aasf
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    xzw.d(new aaqk(aasm.this, 2));
                }
            });
            x();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r6.G = r2;
        r6.u = r7.getString("media_content_type");
        r7 = r7.getString("media_file");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003a, code lost:
    
        if (r7 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r6.v = new java.io.File(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(android.os.Bundle r7) {
        /*
            r6 = this;
            if (r7 == 0) goto L43
            java.lang.String r0 = "media_uri"
            android.os.Parcelable r0 = r7.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
            r6.t = r0
            java.lang.String r0 = "media_type"
            int r0 = r7.getInt(r0)
            int[] r1 = defpackage.a.aI()
            r2 = 0
            r3 = r2
        L18:
            r4 = 2
            if (r3 >= r4) goto L2a
            r4 = r1[r3]
            int r5 = r4 + (-1)
            if (r4 == 0) goto L28
            if (r5 != r0) goto L25
            r2 = r4
            goto L2a
        L25:
            int r3 = r3 + 1
            goto L18
        L28:
            r7 = 0
            throw r7
        L2a:
            r6.G = r2
            java.lang.String r0 = "media_content_type"
            java.lang.String r0 = r7.getString(r0)
            r6.u = r0
            java.lang.String r0 = "media_file"
            java.lang.String r7 = r7.getString(r0)
            if (r7 == 0) goto L43
            java.io.File r0 = new java.io.File
            r0.<init>(r7)
            r6.v = r0
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasm.m(android.os.Bundle):void");
    }

    public final void n(Bundle bundle) {
        String absolutePath;
        bundle.putParcelable("media_uri", this.t);
        int i = this.G;
        int i2 = -1;
        if (i != 0) {
            i2 = (-1) + i;
        }
        bundle.putInt("media_type", i2);
        String str = this.u;
        if (str != null) {
            bundle.putString("media_content_type", str);
        }
        File file = this.v;
        if (file == null) {
            absolutePath = null;
        } else {
            absolutePath = file.getAbsolutePath();
        }
        bundle.putString("media_file", absolutePath);
    }

    public final void o() {
        if (this.i.c()) {
            y(1);
        } else {
            ((yjl) this.j.b()).b(new aasi(this, 1));
        }
    }

    public final void p() {
        if (this.i.d()) {
            y(2);
            return;
        }
        ((yjl) this.j.b()).f(yjh.CAMERA_VIDEO_PERMISSIONS, new aasi(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q(final GalleryContent galleryContent, final GalleryContentItem galleryContentItem, final boolean z, final int i) {
        final int i2;
        Uri uri;
        String str;
        final int i3;
        if (((Boolean) abdh.a.e()).booleanValue()) {
            Context context = this.g;
            context.getClass();
            if (aabr.X(context.getPackageManager())) {
                tqj tqjVar = tqj.STANDARD;
                if (((Boolean) utw.o.e()).booleanValue() && galleryContent != null) {
                    imm immVar = (imm) galleryContent;
                    Size size = immVar.d;
                    int width = size.getWidth();
                    int height = size.getHeight();
                    boolean booleanValue = ((Boolean) vof.a.e()).booleanValue();
                    uri = immVar.b;
                    str = immVar.a;
                    if (booleanValue) {
                        tqjVar = immVar.j;
                    }
                    i2 = height;
                    i3 = width;
                } else if (galleryContentItem != null) {
                    uri = galleryContentItem.b;
                    String str2 = galleryContentItem.c;
                    i3 = galleryContentItem.f();
                    i2 = galleryContentItem.d();
                    str = str2;
                } else {
                    i2 = 0;
                    uri = null;
                    str = "";
                    i3 = 0;
                }
                if (uri != null && gh.z(str) && tqjVar.equals(tqj.STANDARD)) {
                    akul akulVar = this.y;
                    if (akulVar != null) {
                        akulVar.cancel(true);
                        this.y = null;
                    }
                    kor korVar = this.H;
                    korVar.getClass();
                    final String str3 = str;
                    korVar.c().ifPresent(new Consumer() { // from class: aash
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void q(Object obj) {
                            akul a = ((abdi) obj).a();
                            final aasm aasmVar = aasm.this;
                            final String str4 = str3;
                            final int i4 = i3;
                            final int i5 = i2;
                            final GalleryContent galleryContent2 = galleryContent;
                            final GalleryContentItem galleryContentItem2 = galleryContentItem;
                            final boolean z2 = z;
                            final int i6 = i;
                            algk algkVar = new algk() { // from class: aasg
                                @Override // defpackage.algk
                                public final Object apply(Object obj2) {
                                    aasm aasmVar2 = aasm.this;
                                    FileInfoResult fileInfoResult = (FileInfoResult) obj2;
                                    if (fileInfoResult != null) {
                                        if (aabr.Y(str4, fileInfoResult.b, aasmVar2.w)) {
                                            int i7 = i5;
                                            abde abdeVar = new abde(Uri.parse(fileInfoResult.a), aasmVar2.w / 1024, i4, i7);
                                            cg cgVar = aasmVar2.s;
                                            cgVar.getClass();
                                            aktp.K(abdeVar, cgVar);
                                            return null;
                                        }
                                    }
                                    int i8 = i6;
                                    boolean z3 = z2;
                                    aasmVar2.s(galleryContent2, galleryContentItem2, z3, i8);
                                    return null;
                                }
                            };
                            anen anenVar = aasmVar.p;
                            anenVar.getClass();
                            aasmVar.y = a.h(algkVar, anenVar);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                    return;
                }
                s(galleryContent, galleryContentItem, z, i);
                return;
            }
        }
        s(galleryContent, galleryContentItem, z, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void r() {
        yjl yjlVar = (yjl) this.j.b();
        aatq aatqVar = this.k;
        aatqVar.getClass();
        yjlVar.e(new aasi(aatqVar, 2));
    }

    public final void s(imv imvVar, GalleryContentItem galleryContentItem, boolean z, int i) {
        if (((Boolean) utw.o.e()).booleanValue() && imvVar != null) {
            v(imvVar, z, i);
        } else if (galleryContentItem != null) {
            w(galleryContentItem, z, i);
        }
    }

    public final void t(final amqe amqeVar) {
        if (this.l == null) {
            albo.bI(false);
        } else {
            if (this.i.c()) {
                albo.bI(Boolean.valueOf(this.l.n(amqeVar, this.A)));
                return;
            }
            armf armfVar = this.j;
            final SettableFuture create = SettableFuture.create();
            ((yjl) armfVar.b()).b(new yjj() { // from class: aasj
                @Override // defpackage.yjj
                public final void d() {
                    aasm aasmVar = aasm.this;
                    create.set(Boolean.valueOf(aasmVar.l.n(amqeVar, aasmVar.A)));
                }

                @Override // defpackage.yjj
                public final /* synthetic */ boolean e() {
                    return true;
                }

                @Override // defpackage.yjj
                public final /* synthetic */ void a() {
                }

                @Override // defpackage.yjj
                public final /* synthetic */ void b() {
                }

                @Override // defpackage.yjj
                public final /* synthetic */ void c() {
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean u(imv imvVar, boolean z) {
        lbl lblVar = (lbl) this.I.c().orElse(null);
        if (((Boolean) utw.o.e()).booleanValue() && lblVar != null) {
            aabz aabzVar = this.F;
            if ((aabzVar != null && !aabzVar.b()) || ((Boolean) this.x.get()).booleanValue()) {
                imm immVar = (imm) imvVar;
                if ((gh.z(immVar.a) || (((Boolean) vof.c.e()).booleanValue() && gh.m(immVar.a))) && !z) {
                    lblVar.a();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
