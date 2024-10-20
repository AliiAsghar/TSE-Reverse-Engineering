package defpackage;

import android.content.Context;
import android.content.Intent;
import android.hardware.Camera;
import android.net.Uri;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.camera.CameraTextureView;
import com.google.android.apps.messaging.ui.mediapicker.camera.MiniCameraViewImpl;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.reminder.ReminderReceiver;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aauv implements Consumer {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aauv(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [aavb, java.lang.Object] */
    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public final void q(Object obj) {
        int i;
        int i2 = 0;
        switch (this.b) {
            case 0:
                aava aavaVar = (aava) this.a;
                aavaVar.m((Camera) obj, aavaVar.m);
                return;
            case 1:
                ((aava) this.a).j((Camera) obj);
                return;
            case 2:
                ((aava) this.a).l((Camera) obj);
                return;
            case 3:
                ?? r1 = this.a;
                CameraTextureView cameraTextureView = (CameraTextureView) r1;
                cameraTextureView.c.g(r1, cameraTextureView.isShown());
                return;
            case 4:
                aavk aavkVar = (aavk) obj;
                String str = aavkVar.d;
                int i3 = aavkVar.b;
                int i4 = aavkVar.c;
                MiniCameraViewImpl miniCameraViewImpl = (MiniCameraViewImpl) this.a;
                mcl mclVar = miniCameraViewImpl.B;
                int i5 = 3;
                if (true != miniCameraViewImpl.d.n()) {
                    i = 3;
                } else {
                    i = 2;
                }
                if (gh.m(str)) {
                    aozy createBuilder = ampy.a.createBuilder();
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar = createBuilder.b;
                    ampy ampyVar = (ampy) apagVar;
                    ampyVar.c = 1;
                    ampyVar.b |= 1;
                    if (!apagVar.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar2 = createBuilder.b;
                    ampy ampyVar2 = (ampy) apagVar2;
                    ampyVar2.d = i - 1;
                    ampyVar2.b |= 2;
                    if (!apagVar2.isMutable()) {
                        createBuilder.u();
                    }
                    if (i3 <= i4) {
                        i5 = 2;
                    }
                    apag apagVar3 = createBuilder.b;
                    ampy ampyVar3 = (ampy) apagVar3;
                    ampyVar3.e = i5 - 1;
                    ampyVar3.b |= 4;
                    if (!apagVar3.isMutable()) {
                        createBuilder.u();
                    }
                    apag apagVar4 = createBuilder.b;
                    ampy ampyVar4 = (ampy) apagVar4;
                    ampyVar4.b = 8 | ampyVar4.b;
                    ampyVar4.f = false;
                    if (!apagVar4.isMutable()) {
                        createBuilder.u();
                    }
                    ampy ampyVar5 = (ampy) createBuilder.b;
                    ampyVar5.i = 2;
                    ampyVar5.b |= 64;
                    ampy ampyVar6 = (ampy) createBuilder.s();
                    mclVar.n(new ijm(ampyVar6, 9));
                    ahjj ahjjVar = miniCameraViewImpl.D;
                    if (ahjjVar != null) {
                        Uri uri = aavkVar.a;
                        String str2 = aavkVar.d;
                        ((aasy) ahjjVar.a).q = new aast(str2, aavkVar.b, aavkVar.c, ampyVar6, TimeUnit.MILLISECONDS.toSeconds(((aasy) ahjjVar.a).l.f().toEpochMilli()));
                        amqe amqeVar = amqe.MINI_CAMERA;
                        boolean booleanValue = ((Boolean) aaxj.c.e()).booleanValue();
                        aapc aapcVar = (aapc) ((aasy) ahjjVar.a).c;
                        Intent intent = new Intent(aapcVar.r.fe(), (Class<?>) MediaViewerActivity.class);
                        intent.setFlags(536870912);
                        intent.putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, uri);
                        intent.putExtra("opening_source", 6);
                        aawz e = MediaViewerButton.e();
                        e.e(R.string.camera_attach_media);
                        e.d(R.drawable.quantum_ic_check_white_24);
                        e.b(R.string.camera_attach_media_description);
                        e.c(new MediaViewerPrimaryButtonEvent());
                        intent.putExtra("primary_button", e.a());
                        aawz e2 = MediaViewerButton.e();
                        e2.b(R.string.media_viewer_save_media_description);
                        e2.d(R.drawable.quantum_ic_save_alt_white_24);
                        e2.c(new MediaViewerSaveButtonEvent());
                        intent.putParcelableArrayListExtra("secondary_button_list", new ArrayList<>(alog.r(e2.a())));
                        intent.putExtra("media_editor_type", 1);
                        intent.putExtra("content_type", str2);
                        intent.putExtra("open_in_editor", booleanValue);
                        aapcVar.h(intent, 127, amqeVar);
                    }
                    miniCameraViewImpl.d.i();
                    miniCameraViewImpl.n.setEnabled(true);
                    return;
                }
                xyl.k(gh.z(str));
                xyl.l(null);
                throw null;
            case 5:
                Throwable th = (Throwable) obj;
                boolean z = th instanceof CancellationException;
                Object obj2 = this.a;
                if (z) {
                    ((alwl) MiniCameraViewImpl.b.m().h("com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeButtons", 362, "MiniCameraViewImpl.java")).q("takePicture canceled by user action");
                } else if (th instanceof IllegalStateException) {
                    ((alwl) ((alwl) MiniCameraViewImpl.b.m().g(th)).h("com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeButtons", 364, "MiniCameraViewImpl.java")).q("takePicture failed with illegal state");
                } else {
                    ((MiniCameraViewImpl) obj2).f.k(R.string.camera_media_attach_failure);
                    ((alwl) ((alwl) ((alwl) MiniCameraViewImpl.b.h()).g(th)).h("com/google/android/apps/messaging/ui/mediapicker/camera/MiniCameraViewImpl", "initializeButtons", (char) 368, "MiniCameraViewImpl.java")).q("takePicture failed");
                }
                MiniCameraViewImpl miniCameraViewImpl2 = (MiniCameraViewImpl) obj2;
                miniCameraViewImpl2.d.i();
                miniCameraViewImpl2.n.setEnabled(true);
                return;
            case 6:
                isj isjVar = (isj) this.a;
                wfu wfuVar = (wfu) obj;
                if (((aazt) isjVar.a).q()) {
                    ((TextView) ((aazt) isjVar.a).d.L().findViewById(R.id.title)).setText(((aazt) isjVar.a).d.T(R.string.phone_number_input_title_text_multi_sim, Integer.valueOf(wfuVar.a + 1)));
                    if (wfuVar.b.isEmpty()) {
                        ((aazt) isjVar.a).d.L().findViewById(R.id.multi_sim_subtitle).setVisibility(8);
                        return;
                    }
                    aazr aazrVar = ((aazt) isjVar.a).d;
                    Context y = aazrVar.y();
                    TextView textView = (TextView) aazrVar.L().findViewById(R.id.multi_sim_subtitle);
                    Integer valueOf = Integer.valueOf(wfuVar.a + 1);
                    String string = y.getString(R.string.phone_number_input_multisim_text, valueOf, wfuVar.b);
                    if (wfuVar.c) {
                        if (wfuVar.d) {
                            string = y.getString(R.string.phone_number_input_multisim_text_default_call_sms, valueOf, wfuVar.b);
                        } else {
                            string = y.getString(R.string.phone_number_input_multisim_text_default_call, valueOf, wfuVar.b);
                        }
                    } else if (wfuVar.d) {
                        string = y.getString(R.string.phone_number_input_multisim_text_default_sms, valueOf, wfuVar.b);
                    }
                    textView.setText(string);
                    zfh.s(y, textView);
                    return;
                }
                return;
            case 7:
                ((ReminderReceiver) this.a).q("ReminderReceiver", ((woj) obj).n());
                return;
            case 8:
                ((ReminderReceiver) this.a).q("ReminderReceiver", ((woj) obj).k());
                return;
            case 9:
                ((ReminderReceiver) this.a).q("ReminderReceiver", ((woj) obj).b());
                return;
            case 10:
                ((ReminderReceiver) this.a).q("ReminderReceiver", ((woj) obj).g());
                return;
            case 11:
                ((ReminderReceiver) this.a).q("ReminderReceiver", ((woj) obj).j());
                return;
            case 12:
                ((ReminderReceiver) this.a).q("ReminderReceiver", ((woj) obj).o());
                return;
            case 13:
                ((GroupInfo) this.a).d = (String) obj;
                return;
            case 14:
                acph acphVar = (acph) obj;
                ajur ajurVar = new ajur(null, null, null, null);
                try {
                    ajurVar.b = Optional.of(ajpu.c(acphVar.a));
                } catch (IllegalArgumentException unused) {
                }
                Object obj3 = this.a;
                acphVar.b.ifPresent(new ajpx(ajurVar, i2));
                ((anzh) obj3).e = Optional.of(ajurVar.o());
                return;
            case 15:
                ((acom) obj).c.ifPresent(new aauv(this.a, 14));
                return;
            case 16:
                aphx aphxVar = (aphx) obj;
                aozy aozyVar = (aozy) this.a;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                aphz aphzVar = (aphz) aozyVar.b;
                aphz aphzVar2 = aphz.a;
                aphzVar.e = aphxVar.f;
                aphzVar.b |= 4;
                return;
            case 17:
                int intValue = ((Integer) obj).intValue();
                aozy aozyVar2 = (aozy) this.a;
                if (!aozyVar2.b.isMutable()) {
                    aozyVar2.u();
                }
                apja apjaVar = (apja) aozyVar2.b;
                apja apjaVar2 = apja.a;
                apjaVar.b |= 512;
                apjaVar.j = intValue;
                return;
            case 18:
                String str3 = (String) obj;
                aozy aozyVar3 = (aozy) this.a;
                if (!aozyVar3.b.isMutable()) {
                    aozyVar3.u();
                }
                apja apjaVar3 = (apja) aozyVar3.b;
                apja apjaVar4 = apja.a;
                str3.getClass();
                apjaVar3.b |= 64;
                apjaVar3.g = str3;
                return;
            case 19:
                int intValue2 = ((Integer) obj).intValue();
                aozy aozyVar4 = (aozy) this.a;
                if (!aozyVar4.b.isMutable()) {
                    aozyVar4.u();
                }
                apkf apkfVar = (apkf) aozyVar4.b;
                apkf apkfVar2 = apkf.a;
                apkfVar.b |= 4;
                apkfVar.e = intValue2;
                return;
            default:
                acom acomVar = (acom) obj;
                Optional optional = ((acop) this.a).a;
                if (!optional.isEmpty()) {
                    acomVar.a((acom) optional.get());
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.b) {
            case 0:
                return Consumer$CC.$default$andThen(this, consumer);
            case 1:
                return Consumer$CC.$default$andThen(this, consumer);
            case 2:
                return Consumer$CC.$default$andThen(this, consumer);
            case 3:
                return Consumer$CC.$default$andThen(this, consumer);
            case 4:
                return Consumer$CC.$default$andThen(this, consumer);
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case 6:
                return Consumer$CC.$default$andThen(this, consumer);
            case 7:
                return Consumer$CC.$default$andThen(this, consumer);
            case 8:
                return Consumer$CC.$default$andThen(this, consumer);
            case 9:
                return Consumer$CC.$default$andThen(this, consumer);
            case 10:
                return Consumer$CC.$default$andThen(this, consumer);
            case 11:
                return Consumer$CC.$default$andThen(this, consumer);
            case 12:
                return Consumer$CC.$default$andThen(this, consumer);
            case 13:
                return Consumer$CC.$default$andThen(this, consumer);
            case 14:
                return Consumer$CC.$default$andThen(this, consumer);
            case 15:
                return Consumer$CC.$default$andThen(this, consumer);
            case 16:
                return Consumer$CC.$default$andThen(this, consumer);
            case 17:
                return Consumer$CC.$default$andThen(this, consumer);
            case 18:
                return Consumer$CC.$default$andThen(this, consumer);
            case 19:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }
}
