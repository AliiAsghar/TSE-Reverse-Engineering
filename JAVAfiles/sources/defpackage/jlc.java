package defpackage;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlc extends arrp implements arqg {
    private final /* synthetic */ int v;
    public static final jlc u = new jlc(20);
    public static final jlc t = new jlc(19);
    public static final jlc s = new jlc(18);
    public static final jlc r = new jlc(17);
    public static final jlc q = new jlc(16);
    public static final jlc p = new jlc(15);
    public static final jlc o = new jlc(14);
    public static final jlc n = new jlc(13);
    public static final jlc m = new jlc(12);
    public static final jlc l = new jlc(11);
    public static final jlc k = new jlc(10);
    public static final jlc j = new jlc(9);
    public static final jlc i = new jlc(8);
    public static final jlc h = new jlc(7);
    public static final jlc g = new jlc(6);
    public static final jlc f = new jlc(5);
    public static final jlc e = new jlc(4);
    public static final jlc d = new jlc(3);
    public static final jlc c = new jlc(2);
    public static final jlc b = new jlc(1);
    public static final jlc a = new jlc(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlc(int i2) {
        super(0);
        this.v = i2;
    }

    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        switch (this.v) {
            case 0:
                return null;
            case 1:
                return arnb.a;
            case 2:
            case 3:
                return null;
            case 4:
                return arnb.a;
            case 5:
                return arnb.a;
            case 6:
                return arnb.a;
            case 7:
                return arnb.a;
            case 8:
                alvi alviVar = joe.a;
                Set<String> n2 = hld.n();
                ArrayList arrayList = new ArrayList(aqjn.J(n2, 10));
                for (String str : n2) {
                    afsx H = afwv.H(str);
                    if (H != null) {
                        arrayList.add(H);
                    } else {
                        throw new IllegalStateException("Bad type in SUPPORTED_MEDIA_TYPES: ".concat(String.valueOf(str)));
                    }
                }
                Set aE = aqjn.aE(arrayList);
                if (aE.size() == hld.n().size()) {
                    return aE;
                }
                throw new IllegalStateException("SUPPORTED_MEDIA_TYPES has less items than SUPPORTED_MEDIA_TYPE_STRINGS");
            case 9:
                String lowerCase = "text/x-vCard".toLowerCase(Locale.ROOT);
                lowerCase.getClass();
                return aqil.r(new String[]{"application/hbs-vcs", "application/ics", "application/vcs", "application/ogg", "audio/*", "application/msword", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "image/*", "application/pdf", "application/vnd.ms-powerpoint", "application/vnd.openxmlformats-officedocument.presentationml.presentation", "text/calendar", "text/x-vCalendar", "text/x-vCard", lowerCase, "text/x-vcalendar", "video/*", "application/vnd.ms-excel", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"});
            case 10:
                return aqil.r(new agek[]{agek.h, agek.g});
            case 11:
                return wpn.a;
            case 12:
                return arnb.a;
            case 13:
                alvw d2 = jva.b.d();
                d2.X(alwp.a, "BugleComposeRow2");
                ((alvg) d2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/contacts/ContactsShortcutHandler$checkForAndHandlePendingResult$uri$1", "invoke", 154, "ContactsShortcutHandler.kt")).q("Contact picker opened flag detected, attempting to recover result");
                return arnb.a;
            case 14:
                alvw d3 = jvd.b.d();
                d3.X(alwp.a, "BugleComposeRow2");
                ((alvg) d3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/files/FilesShortcutHandler$checkForAndHandlePendingResult$uri$1", "invoke", 151, "FilesShortcutHandler.kt")).q("File picker opened flag detected, attempting to recover result");
                return arnb.a;
            case 15:
                alvw d4 = jvf.a.d();
                d4.X(alwp.a, "BugleComposeRow2");
                ((alvg) d4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/inputs/shortcuts/location/LocationHandlerImpl$checkForAndHandlePendingResult$1$result$1", "invoke", 139, "LocationHandlerImpl.kt")).q("Location picker opened flag detected, attempting to recover result");
                return arnb.a;
            case 16:
                return arnb.a;
            case 17:
                return null;
            case 18:
                return arnb.a;
            case 19:
                utz utzVar = jcj.a;
                return (Boolean) jcj.f.e();
            default:
                return arnb.a;
        }
    }
}
