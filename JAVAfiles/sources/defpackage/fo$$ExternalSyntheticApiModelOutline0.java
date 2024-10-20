package defpackage;

import android.app.Notification;
import android.media.AudioRouting$OnRoutingChangedListener;
import android.media.AudioTrack;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.LocaleList;
import android.view.PointerIcon;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class fo$$ExternalSyntheticApiModelOutline0 {
    /* renamed from: m$1 */
    public static /* bridge */ /* synthetic */ Class m398m$1() {
        return Notification.DecoratedCustomViewStyle.class;
    }

    public static /* bridge */ /* synthetic */ Notification.MessagingStyle m(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
        return messagingStyle.addMessage(message);
    }

    public static /* bridge */ /* synthetic */ Notification.MessagingStyle m(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
        return messagingStyle.setConversationTitle(charSequence);
    }

    public static /* bridge */ /* synthetic */ MediaCodec.CryptoInfo.Pattern m(Object obj) {
        return (MediaCodec.CryptoInfo.Pattern) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ LocaleList m386m() {
        return LocaleList.getDefault();
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ LocaleList m387m(Object obj) {
        return (LocaleList) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ PointerIcon m388m(Object obj) {
        return (PointerIcon) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Class m390m() {
        return Notification.MessagingStyle.class;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Consumer m393m(Object obj) {
        return (Consumer) obj;
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ Predicate m394m(Object obj) {
        return (Predicate) obj;
    }

    public static /* bridge */ /* synthetic */ void m(AudioTrack audioTrack, AudioRouting$OnRoutingChangedListener audioRouting$OnRoutingChangedListener, Handler handler) {
        audioTrack.addOnRoutingChangedListener(audioRouting$OnRoutingChangedListener, handler);
    }

    /* renamed from: m */
    public static /* bridge */ /* synthetic */ void m395m(LocaleList localeList) {
        LocaleList.setDefault(localeList);
    }
}
