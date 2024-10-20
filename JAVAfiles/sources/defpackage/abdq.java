package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.wearable.WearableBindService;
import com.google.android.gms.wearable.ChannelClient$Channel;
import j$.util.function.Consumer$CC;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Executor;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abdq implements ufz {
    final /* synthetic */ rrb a;
    final /* synthetic */ ChannelClient$Channel b;
    final /* synthetic */ Uri c;
    final /* synthetic */ WearableBindService d;

    public abdq(WearableBindService wearableBindService, rrb rrbVar, ChannelClient$Channel channelClient$Channel, Uri uri) {
        this.a = rrbVar;
        this.b = channelClient$Channel;
        this.c = uri;
        this.d = wearableBindService;
    }

    @Override // defpackage.ufz
    public final void fC(ufw ufwVar) {
        alwl alwlVar = (alwl) WearableBindService.a.i();
        alwlVar.X(ydl.M, "WearableBindService");
        ((alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService$1", "onMediaResourceLoadError", 696, "WearableBindService.java")).t("onChannelOpened couldn't load media part: %s", this.c);
        if (this.a.g()) {
            this.a.f();
            WearableBindService wearableBindService = this.d;
            wearableBindService.b.remove(this.b);
        }
    }

    @Override // defpackage.ufz
    public final /* bridge */ /* synthetic */ void fD(ufw ufwVar, ugg uggVar, boolean z) {
        final ufu ufuVar = (ufu) uggVar;
        alwl alwlVar = (alwl) WearableBindService.a.g();
        alwlVar.X(ydl.M, "WearableBindService");
        alwl alwlVar2 = (alwl) alwlVar.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 743, "WearableBindService.java");
        final rrb rrbVar = this.a;
        final ChannelClient$Channel channelClient$Channel = this.b;
        alwlVar2.E("#sendMediaViaChannelAsync path: %s, isBound: %s", channelClient$Channel.a(), rrbVar.g());
        if (rrbVar.g()) {
            final WearableBindService wearableBindService = this.d;
            wearableBindService.f(channelClient$Channel).k(qiu.c(new Consumer() { // from class: abdn
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void q(Object obj) {
                    alvw i;
                    WearableBindService wearableBindService2 = WearableBindService.this;
                    rrb rrbVar2 = rrbVar;
                    ChannelClient$Channel channelClient$Channel2 = channelClient$Channel;
                    ufu ufuVar2 = ufuVar;
                    OutputStream outputStream = (OutputStream) obj;
                    try {
                        try {
                            try {
                                if (!rrbVar2.g()) {
                                    alwl alwlVar3 = (alwl) WearableBindService.a.i();
                                    alwlVar3.X(ydl.M, "WearableBindService");
                                    ((alwl) alwlVar3.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 756, "WearableBindService.java")).t("sendMediaViaChannelAsync channel callback: obsolete request obsolete request is no longer bound, path: %s", channelClient$Channel2.a());
                                    try {
                                        outputStream.close();
                                        rrbVar2.f();
                                        wearableBindService2.b.remove(channelClient$Channel2);
                                        return;
                                    } catch (Exception e) {
                                        e = e;
                                        i = WearableBindService.a.i();
                                        alwl alwlVar4 = (alwl) i;
                                        alwlVar4.X(ydl.M, "WearableBindService");
                                        ((alwl) ((alwl) alwlVar4.g(e)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 799, "WearableBindService.java")).q("sendMediaViaChannelAsync: Failed to close channel.");
                                        return;
                                    }
                                }
                                byte[] j = ufuVar2.j();
                                if (((pqk) wearableBindService2.E.b()).a()) {
                                    if (j != null) {
                                        outputStream.write(j, 0, j.length);
                                    } else {
                                        alwl alwlVar5 = (alwl) WearableBindService.a.i();
                                        alwlVar5.X(ydl.M, "WearableBindService");
                                        ((alwl) alwlVar5.h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 770, "WearableBindService.java")).q("sendMediaViaChannelAsync: ImageResource returned null bytes.");
                                    }
                                } else {
                                    j.getClass();
                                    outputStream.write(j, 0, j.length);
                                }
                                outputStream.close();
                                rrbVar2.f();
                                wearableBindService2.b.remove(channelClient$Channel2);
                            } catch (IOException e2) {
                                alwl alwlVar6 = (alwl) WearableBindService.a.i();
                                alwlVar6.X(ydl.M, "WearableBindService");
                                ((alwl) ((alwl) alwlVar6.g(e2)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 780, "WearableBindService.java")).q("sendMediaViaChannelAsync: Channel failed to write.");
                                outputStream.close();
                                rrbVar2.f();
                                wearableBindService2.b.remove(channelClient$Channel2);
                            } catch (uft e3) {
                                alwl alwlVar7 = (alwl) WearableBindService.a.i();
                                alwlVar7.X(ydl.M, "WearableBindService");
                                ((alwl) ((alwl) alwlVar7.g(e3)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 786, "WearableBindService.java")).q("sendMediaViaChannelAsync: Could not get bytes from image type to write to channel.");
                                outputStream.close();
                                rrbVar2.f();
                                wearableBindService2.b.remove(channelClient$Channel2);
                            }
                        } catch (Exception e4) {
                            e = e4;
                            i = WearableBindService.a.i();
                        }
                    } catch (Throwable th) {
                        try {
                            outputStream.close();
                            rrbVar2.f();
                            wearableBindService2.b.remove(channelClient$Channel2);
                        } catch (Exception e5) {
                            alwl alwlVar8 = (alwl) WearableBindService.a.i();
                            alwlVar8.X(ydl.M, "WearableBindService");
                            ((alwl) ((alwl) alwlVar8.g(e5)).h("com/google/android/apps/messaging/wearable/WearableBindService", "sendMediaViaChannelAsync", 799, "WearableBindService.java")).q("sendMediaViaChannelAsync: Failed to close channel.");
                        }
                        throw th;
                    }
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            }), (Executor) wearableBindService.v.b());
        }
    }
}
