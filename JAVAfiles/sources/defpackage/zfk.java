package defpackage;

import android.view.View;
import com.google.android.apps.messaging.ui.appsettings.RcsMultiSimStatusCheckboxView;
import com.google.android.apps.messaging.ui.appsettings.RcsSimStatusView;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.attachment.video.VideoAttachmentView;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import com.google.android.apps.messaging.ui.conversation.details.CdpOpeningArguments;
import com.google.android.apps.messaging.ui.conversation.message.ClickFixingEmojiAppCompatTextView;
import com.google.android.apps.messaging.ui.conversation.suggestions.shortcuts.SuggestionShortcutView;
import com.google.android.apps.messaging.ui.debug.DebugPrefsItemView;
import com.google.android.apps.messaging.ui.rcs.setup.RcsWelcomeMessageView;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zfk implements apxw {
    public static zfi a(cg cgVar) {
        if (cgVar instanceof zfi) {
            return (zfi) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, zfj.class));
    }

    public static zaw c(eog eogVar) {
        eogVar.getClass();
        String str = (String) eogVar.a("group_name");
        if (str == null) {
            str = "";
        }
        return new zaw(str);
    }

    public static zfn d(cg cgVar) {
        if (cgVar instanceof zfn) {
            return (zfn) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, zfp.class));
    }

    public static zjn e(cg cgVar) {
        if (cgVar instanceof zjn) {
            return (zjn) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, zjp.class));
    }

    public static RcsMultiSimStatusCheckboxView f(View view) {
        if (view instanceof RcsMultiSimStatusCheckboxView) {
            RcsMultiSimStatusCheckboxView rcsMultiSimStatusCheckboxView = (RcsMultiSimStatusCheckboxView) view;
            rcsMultiSimStatusCheckboxView.getClass();
            return rcsMultiSimStatusCheckboxView;
        }
        throw new IllegalStateException(hht.d(view, zki.class, "Attempt to inject a View wrapper of type "));
    }

    public static RcsSimStatusView g(View view) {
        if (view instanceof RcsSimStatusView) {
            RcsSimStatusView rcsSimStatusView = (RcsSimStatusView) view;
            rcsSimStatusView.getClass();
            return rcsSimStatusView;
        }
        throw new IllegalStateException(hht.d(view, zky.class, "Attempt to inject a View wrapper of type "));
    }

    public static AttachmentsContainer h(View view) {
        if (view instanceof AttachmentsContainer) {
            AttachmentsContainer attachmentsContainer = (AttachmentsContainer) view;
            attachmentsContainer.getClass();
            return attachmentsContainer;
        }
        throw new IllegalStateException(hht.d(view, zop.class, "Attempt to inject a View wrapper of type "));
    }

    public static VideoAttachmentView i(View view) {
        if (view instanceof VideoAttachmentView) {
            VideoAttachmentView videoAttachmentView = (VideoAttachmentView) view;
            videoAttachmentView.getClass();
            return videoAttachmentView;
        }
        throw new IllegalStateException(hht.d(view, zpj.class, "Attempt to inject a View wrapper of type "));
    }

    public static ComposeMessageView j(View view) {
        if (view instanceof ComposeMessageView) {
            ComposeMessageView composeMessageView = (ComposeMessageView) view;
            composeMessageView.getClass();
            return composeMessageView;
        }
        throw new IllegalStateException(hht.d(view, zrb.class, "Attempt to inject a View wrapper of type "));
    }

    public static zxg k(cg cgVar) {
        if (cgVar instanceof zxg) {
            return (zxg) cgVar;
        }
        throw new IllegalStateException(hht.e(cgVar, zxh.class));
    }

    public static CdpOpeningArguments l(eog eogVar) {
        eogVar.getClass();
        CdpOpeningArguments cdpOpeningArguments = (CdpOpeningArguments) eogVar.a("cdp_opening_arguments");
        if (cdpOpeningArguments == null) {
            return new CdpOpeningArguments(0, 1, null);
        }
        return cdpOpeningArguments;
    }

    public static ClickFixingEmojiAppCompatTextView m(View view) {
        if (view instanceof ClickFixingEmojiAppCompatTextView) {
            ClickFixingEmojiAppCompatTextView clickFixingEmojiAppCompatTextView = (ClickFixingEmojiAppCompatTextView) view;
            clickFixingEmojiAppCompatTextView.getClass();
            return clickFixingEmojiAppCompatTextView;
        }
        throw new IllegalStateException(hht.d(view, aacd.class, "Attempt to inject a View wrapper of type "));
    }

    public static SuggestionShortcutView n(View view) {
        if (view instanceof SuggestionShortcutView) {
            SuggestionShortcutView suggestionShortcutView = (SuggestionShortcutView) view;
            suggestionShortcutView.getClass();
            return suggestionShortcutView;
        }
        throw new IllegalStateException(hht.d(view, aagk.class, "Attempt to inject a View wrapper of type "));
    }

    public static DebugPrefsItemView o(View view) {
        if (view instanceof DebugPrefsItemView) {
            DebugPrefsItemView debugPrefsItemView = (DebugPrefsItemView) view;
            debugPrefsItemView.getClass();
            return debugPrefsItemView;
        }
        throw new IllegalStateException(hht.d(view, aajw.class, "Attempt to inject a View wrapper of type "));
    }

    public static RcsWelcomeMessageView p(View view) {
        if (view instanceof RcsWelcomeMessageView) {
            RcsWelcomeMessageView rcsWelcomeMessageView = (RcsWelcomeMessageView) view;
            rcsWelcomeMessageView.getClass();
            return rcsWelcomeMessageView;
        }
        throw new IllegalStateException(hht.d(view, aays.class, "Attempt to inject a View wrapper of type "));
    }

    public static String q() {
        return "cslib.always_set_initial_state";
    }

    public static String r() {
        return "cslib.use_character_anonymizer";
    }

    public static String s() {
        return "cslib.enable_fi_multi_sync_help_article_in_rcs_settings";
    }

    public static String t() {
        return "cslib.enable_grpc_to_tycho_for_fi_multi_sync_status";
    }

    public static alog u(zua zuaVar, zvu zvuVar, zwo zwoVar, zwv zwvVar, zvn zvnVar, zur zurVar, zvh zvhVar, zvc zvcVar, zvh zvhVar2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zsk(zurVar, new zsn(-1, false, false, true)));
        arrayList.add(new zsk(zwvVar, new zsn(1, false, true, false)));
        arrayList.add(new zsk(zwoVar, new zsn(2, true, true, false)));
        arrayList.add(new zsk(zvuVar, new zsn(3, false, false, false)));
        arrayList.add(new zsk(zuaVar, new zsn(4, false, false, false)));
        arrayList.add(new zsk(zvnVar, new zsn(5, true, true, true)));
        arrayList.add(new zsk(zvhVar, new zsn(6, false, true, true)));
        arrayList.add(new zsk(zvcVar, new zsn(7, false, true, true)));
        arrayList.add(new zsk(zvhVar2, new zsn(8, false, true, true)));
        alog D = alog.D(arrayList);
        D.getClass();
        return D;
    }

    public static alog v(zvh zvhVar, zvc zvcVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zsk(zvhVar, new zsn(1, false, true, true)));
        arrayList.add(new zsk(zvcVar, new zsn(2, false, true, true)));
        alog D = alog.D(arrayList);
        D.getClass();
        return D;
    }

    @Override // defpackage.armf, defpackage.arme
    public final /* synthetic */ Object b() {
        throw null;
    }
}
