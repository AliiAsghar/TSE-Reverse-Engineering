package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.ui.animation.illustration.IllustrationViewStub;
import com.google.android.apps.messaging.ui.conversation.AudioButtonView;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import j$.time.Duration;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yar implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ yar(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v51, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v65, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v61, types: [armf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.util.function.Consumer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v49, types: [armf, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x02cf -> B:91:0x02f5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:116:0x02d1 -> B:91:0x02f5). Please report as a decompilation issue!!! */
    @Override // java.lang.Runnable
    public final void run() {
        alvw i;
        AssetFileDescriptor assetFileDescriptor = null;
        switch (this.c) {
            case 0:
                yav yavVar = (yav) this.a;
                if (yavVar.n.isEmpty()) {
                    yavVar.e.registerReceiver(yavVar.r, yavVar.g, 2);
                }
                yavVar.n.add(this.b);
                return;
            case 1:
                ((yav) this.b).m.add(this.a);
                return;
            case 2:
                ((yav) this.b).m.remove(this.a);
                return;
            case 3:
                Object obj = this.b;
                Object obj2 = ((ybq) obj).e;
                ?? r2 = this.a;
                synchronized (obj2) {
                    ((ybq) obj).f.put(1, new ybo((ybq) obj, r2));
                    ((ybq) obj).a();
                }
                return;
            case 4:
                int i2 = ybo.c;
                this.a.q(this.b);
                return;
            case 5:
                int i3 = ybo.c;
                this.a.q(this.b);
                return;
            case 6:
                Object obj3 = this.a;
                Object obj4 = this.b;
                try {
                    ((MediaPlayer) obj3).setAudioAttributes(new AudioAttributes.Builder().setUsage(13).build());
                    AssetFileDescriptor openRawResourceFd = ((Context) obj4).getResources().openRawResourceFd(R.raw.message_sent_v2);
                    ((MediaPlayer) obj3).setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
                    openRawResourceFd.close();
                    ((MediaPlayer) obj3).setOnPreparedListener(new ygp());
                    ((MediaPlayer) obj3).setOnCompletionListener(new aawq(1));
                    ((MediaPlayer) obj3).prepareAsync();
                    return;
                } catch (Exception e) {
                    xyo e2 = ygq.a.e();
                    e2.H("Error playing sound id:");
                    e2.F(R.raw.message_sent_v2);
                    e2.r(e);
                    ygu.b((MediaPlayer) obj3);
                    return;
                }
            case 7:
                ((ygs) this.a).b();
                if (!((dtq) this.b).b(ygh.a(1))) {
                    ((alwl) ygs.a.m().h("com/google/android/apps/messaging/shared/util/media/audio/PlaybackSession", "getCompletionListener", BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED, "PlaybackSession.java")).q("Media player finished playback before being released");
                    return;
                }
                return;
            case 8:
                ((ygz) this.b).b(((yhf) this.a).i);
                return;
            case 9:
                ((ygz) this.b).a(((yhf) this.a).i);
                return;
            case 10:
                ((ygz) this.b).a(((yhf) this.a).i);
                return;
            case 11:
                Uri uri = ((yhd) this.b).a;
                alwo alwoVar = yhh.a;
                uri.getClass();
                yhf yhfVar = (yhf) this.a;
                long j = 0;
                try {
                    try {
                        assetFileDescriptor = aipx.c(yhfVar.l, uri);
                        if (assetFileDescriptor == null) {
                            ((alwl) ((alwl) yhh.a.i()).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoderUtil", "getContentLengthForLogging", 48, "VideoTranscoderUtil.java")).t("Cannot open asset of %s for file size logging", uri);
                        } else {
                            j = assetFileDescriptor.getLength();
                            try {
                                assetFileDescriptor.close();
                            } catch (IOException e3) {
                                e = e3;
                                i = yhh.a.i();
                                ((alwl) ((alwl) ((alwl) i).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoderUtil", "getContentLengthForLogging", 61, "VideoTranscoderUtil.java")).t("Cannot close AssetFileDescriptor for %s during file size logging", uri);
                                yhfVar.m.m((int) j);
                                return;
                            }
                        }
                    } catch (FileNotFoundException e4) {
                        ((alwl) ((alwl) ((alwl) yhh.a.i()).g(e4)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoderUtil", "getContentLengthForLogging", 54, "VideoTranscoderUtil.java")).t("Cannot query file size of %s for logging", uri);
                        if (assetFileDescriptor != null) {
                            try {
                                assetFileDescriptor.close();
                            } catch (IOException e5) {
                                e = e5;
                                i = yhh.a.i();
                                ((alwl) ((alwl) ((alwl) i).g(e)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoderUtil", "getContentLengthForLogging", 61, "VideoTranscoderUtil.java")).t("Cannot close AssetFileDescriptor for %s during file size logging", uri);
                                yhfVar.m.m((int) j);
                                return;
                            }
                        }
                    }
                    yhfVar.m.m((int) j);
                    return;
                } catch (Throwable th) {
                    if (assetFileDescriptor != null) {
                        try {
                            assetFileDescriptor.close();
                        } catch (IOException e6) {
                            ((alwl) ((alwl) ((alwl) yhh.a.i()).g(e6)).h("com/google/android/apps/messaging/shared/util/media/video/VideoTranscoderUtil", "getContentLengthForLogging", 61, "VideoTranscoderUtil.java")).t("Cannot close AssetFileDescriptor for %s during file size logging", uri);
                        }
                    }
                    throw th;
                }
            case 12:
                ((ygz) this.b).b(((yhf) this.a).i);
                return;
            case 13:
                Object obj5 = this.b;
                if (obj5 != null) {
                    Object obj6 = this.a;
                    Intent intent = (Intent) obj5;
                    String action = intent.getAction();
                    if (!"android.intent.action.PACKAGE_ADDED".equals(action) && !"android.intent.action.PACKAGE_CHANGED".equals(action) && !"android.intent.action.PACKAGE_REPLACED".equals(action)) {
                        if ("android.intent.action.UID_REMOVED".equals(action)) {
                            int intExtra = intent.getIntExtra("android.intent.extra.UID", -1);
                            xyo a = ylv.a.a();
                            a.H("UID has been removed from the system");
                            a.x("uid", intExtra);
                            a.q();
                            if (intExtra != -1) {
                                ylu yluVar = ((ylv) obj6).b;
                                synchronized (yluVar.b) {
                                    if (yluVar.d.remove(Integer.valueOf(intExtra))) {
                                        xyo a2 = ylu.a.a();
                                        a2.H("Removed Bugle verified uid");
                                        a2.x("uid", intExtra);
                                        a2.q();
                                    }
                                }
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    Uri data = intent.getData();
                    if (data != null && "package:com.google.android.ims".equals(data.toString())) {
                        ylv.a.o("CarrierServices APK package change detected, updating Bugle's verified uids cache");
                        ((ylv) obj6).b.a();
                        return;
                    }
                    return;
                }
                return;
            case 14:
                afzs afzsVar = (afzs) this.b;
                Matrix imageMatrix = afzsVar.getImageMatrix();
                IllustrationViewStub illustrationViewStub = (IllustrationViewStub) this.a;
                afzsVar.setScaleType(illustrationViewStub.c);
                float f = illustrationViewStub.b;
                imageMatrix.setScale(f, f);
                imageMatrix.postTranslate((afzsVar.getMeasuredWidth() / 2.0f) - ((afzsVar.getDrawable().getIntrinsicWidth() * illustrationViewStub.b) / 2.0f), (afzsVar.getMeasuredHeight() / 2.0f) - ((afzsVar.getDrawable().getIntrinsicHeight() * illustrationViewStub.b) / 2.0f));
                afzsVar.setImageMatrix(imageMatrix);
                return;
            case 15:
                ?? r0 = this.a;
                boolean equals = ((String) r0).equals("");
                Object obj7 = this.b;
                if (equals) {
                    ((zop) obj7).a();
                    return;
                }
                zop zopVar = (zop) obj7;
                zopVar.e();
                ((TextView) ((View) zopVar.B.b).findViewById(R.id.tooltip_content)).setText((CharSequence) r0);
                return;
            case 16:
                Object obj8 = this.b;
                View view = (View) obj8;
                view.setVisibility(8);
                zop zopVar2 = (zop) this.a;
                zopVar2.b.removeView(view);
                zopVar2.p.remove(obj8);
                return;
            case 17:
                ((AudioButtonView) this.a).i.delete((Uri) this.b, null, null);
                return;
            case 18:
                aozy createBuilder = apll.a.createBuilder();
                aozy createBuilder2 = aozn.a.createBuilder();
                int nanos = (int) ((Duration) this.a).toNanos();
                if (!createBuilder2.b.isMutable()) {
                    createBuilder2.u();
                }
                ((aozn) createBuilder2.b).c = nanos;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                Object obj9 = this.b;
                apll apllVar = (apll) createBuilder.b;
                aozn aoznVar = (aozn) createBuilder2.s();
                aoznVar.getClass();
                apllVar.c = aoznVar;
                apllVar.b |= 1;
                zrs zrsVar = (zrs) obj9;
                amxo n = ((hgj) zrsVar.d.b()).n();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                apll apllVar2 = (apll) createBuilder.b;
                apllVar2.d = n.h;
                apllVar2.b = 2 | apllVar2.b;
                maq maqVar = (maq) zrsVar.c.b();
                amfq amfqVar = (amfq) amfr.a.createBuilder();
                amfp amfpVar = amfp.COMPOSE_BOX_HINT_TEXT_FLICKER_EVENT;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar = (amfr) amfqVar.b;
                amfrVar.i = amfpVar.dg;
                amfrVar.b = 1 | amfrVar.b;
                if (!amfqVar.b.isMutable()) {
                    amfqVar.u();
                }
                amfr amfrVar2 = (amfr) amfqVar.b;
                apll apllVar3 = (apll) createBuilder.s();
                apllVar3.getClass();
                amfrVar2.aM = apllVar3;
                amfrVar2.e |= VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES;
                maqVar.j(amfqVar);
                return;
            case 19:
                Object obj10 = this.a;
                Object obj11 = this.b;
                akrh e7 = aktp.e("AddContactBannerDatabaseOperations#incrementConversationOpenCount");
                try {
                    int a3 = ((znp) obj10).a((ConversationIdType) obj11);
                    if (a3 <= ((Integer) zub.a.e()).intValue() + 1) {
                        rtz rtzVar = (rtz) ((znp) obj10).b.b();
                        sng sngVar = new sng();
                        sngVar.aj("incrementConversationOpenCount");
                        sngVar.z(a3 + 1);
                        rtzVar.ah((ConversationIdType) obj11, sngVar);
                    }
                    e7.close();
                    return;
                } catch (Throwable th2) {
                    try {
                        e7.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            default:
                boolean equals2 = Boolean.TRUE.equals(this.a);
                Object obj12 = this.b;
                if (equals2) {
                    ((aacp) obj12).h();
                    return;
                } else {
                    ((aacp) obj12).i();
                    return;
                }
        }
    }

    public /* synthetic */ yar(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
