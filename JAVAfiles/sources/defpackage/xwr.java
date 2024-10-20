package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.speech.tts.TextToSpeech;
import android.telephony.PhoneNumberUtils;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.widget.Button;
import android.widget.Toast;
import com.google.android.apps.messaging.R;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class xwr {
    private final Context f;
    private TextToSpeech g;
    private final armf i;
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/util/accessibility/AccessibilityUtil");
    public static final String a = Button.class.getName();
    private static final String[] c = new String[10];
    private static final alpt d = new altx("com.samsung.SMT");
    private final Object e = new Object();
    private final Map h = new HashMap();

    public xwr(Context context, armf armfVar) {
        this.f = context;
        this.i = armfVar;
    }

    @Deprecated
    public static String d(Resources resources, String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (c[0] == null) {
            int[] iArr = {R.string.content_description_for_number_zero, R.string.content_description_for_number_one, R.string.content_description_for_number_two, R.string.content_description_for_number_three, R.string.content_description_for_number_four, R.string.content_description_for_number_five, R.string.content_description_for_number_six, R.string.content_description_for_number_seven, R.string.content_description_for_number_eight, R.string.content_description_for_number_nine};
            for (int i = 0; i < 10; i++) {
                c[i] = resources.getString(iArr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (char c2 : str.toCharArray()) {
            if (c2 >= '0' && c2 <= '9') {
                if (z) {
                    sb.append(' ');
                }
                sb.append(c[c2 - '0']);
                sb.append(' ');
                z = false;
            } else {
                sb.append(c2);
                z = true;
            }
        }
        return sb.toString();
    }

    public static String e(String str) {
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + length);
        for (char c2 : str.toCharArray()) {
            sb.append(c2);
            sb.append((char) 8291);
        }
        return sb.toString();
    }

    public static void f(View view, int i) {
        i(view, view.getContext().getResources().getString(i));
    }

    public static boolean g(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            return true;
        }
        return false;
    }

    public static boolean h(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            return true;
        }
        return false;
    }

    public static void i(View view, CharSequence charSequence) {
        Context context = view.getContext();
        if (!g(context)) {
            return;
        }
        Toast.makeText(context, charSequence, 0).show();
    }

    public final SpannableString a(msh mshVar) {
        return b(albo.ag(mshVar.G(((Boolean) new msn(19).get()).booleanValue()).a));
    }

    @Deprecated
    public final SpannableString b(String str) {
        String defaultEngine;
        SpannableString spannableString;
        SpannableString spannableString2 = (SpannableString) this.h.get(str);
        if (spannableString2 == null) {
            synchronized (this.e) {
                if (this.g == null) {
                    this.g = new TextToSpeech(this.f, new TextToSpeech.OnInitListener() { // from class: xwn
                        @Override // android.speech.tts.TextToSpeech.OnInitListener
                        public final void onInit(int i) {
                            String str2 = xwr.a;
                        }
                    });
                }
                defaultEngine = this.g.getDefaultEngine();
            }
            alvw f = b.f();
            f.X(alwp.a, "Bugle");
            ((alvg) ((alvg) f).h("com/google/android/apps/messaging/shared/util/accessibility/AccessibilityUtil", "getTtsEngine", 228, "AccessibilityUtil.java")).t("TTS engine: %s", defaultEngine);
            String y = wfh.y(str);
            if (d.contains(defaultEngine)) {
                StringBuilder sb = new StringBuilder();
                boolean z = false;
                for (char c2 : y.toCharArray()) {
                    if (c2 >= '0' && c2 <= '9') {
                        if (z) {
                            sb.append((char) 8291);
                        }
                        z = true;
                    } else {
                        z = false;
                    }
                    sb.append(c2);
                }
                spannableString = new SpannableString(sb.toString());
            } else {
                spannableString = new SpannableString(y);
                PhoneNumberUtils.addTtsSpan(spannableString, 0, y.length());
            }
            this.h.put(str, spannableString);
            return spannableString;
        }
        return spannableString2;
    }

    public final String c(xwq xwqVar) {
        String string;
        String string2;
        String string3;
        String str;
        String string4;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Resources resources = xwqVar.a;
        int i7 = xwqVar.b;
        if (i7 != 0) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
                            string = "";
                        } else {
                            string = resources.getString(R.string.notyetdelivered);
                        }
                    } else {
                        string = resources.getString(R.string.sending);
                    }
                } else if (xwqVar.c) {
                    string = resources.getString(R.string.unsent);
                } else {
                    int i8 = xwqVar.m;
                    if (i8 == 0) {
                        string = resources.getString(R.string.unread);
                    } else {
                        string = resources.getQuantityString(R.plurals.unread_with_count, i8, Integer.valueOf(i8));
                    }
                }
            } else {
                string = resources.getString(R.string.urgent);
            }
        } else {
            string = resources.getString(R.string.failed_message);
        }
        if (xwqVar.c) {
            string2 = xwqVar.a.getString(R.string.outgoing);
        } else {
            string2 = xwqVar.a.getString(R.string.incoming);
        }
        if (xwqVar.c) {
            string3 = xwqVar.a.getString(R.string.to);
        } else {
            string3 = xwqVar.a.getString(R.string.from);
        }
        if (!albo.ah(xwqVar.h)) {
            str = xwqVar.a.getString(R.string.subject_content_description, xwqVar.h);
        } else {
            str = null;
        }
        if (((obf) this.i.b()).a() && (i5 = xwqVar.b) != 1 && (i5 != 3 || xwqVar.c)) {
            int i9 = xwqVar.f;
            if (i9 == 0) {
                i6 = R.string.unsuccessful_message_format_v2;
            } else if (i9 == 1) {
                if (gh.s(xwqVar.g)) {
                    i6 = R.string.unsuccessful_message_format_with_single_attachment_location_v2;
                } else if (gh.m(xwqVar.g)) {
                    i6 = R.string.unsuccessful_message_format_with_single_attachment_image_v2;
                } else if (gh.z(xwqVar.g)) {
                    i6 = R.string.unsuccessful_message_format_with_single_attachment_video_v2;
                } else if (gh.e(xwqVar.g)) {
                    i6 = R.string.unsuccessful_message_format_with_single_attachment_audio_v2;
                } else {
                    i6 = R.string.unsuccessful_message_format_with_single_attachment_v2;
                }
            } else {
                i6 = R.string.unsuccessful_message_format_with_multiple_attachments_v2;
            }
            Resources resources2 = xwqVar.a;
            String ag = albo.ag(string);
            String ag2 = albo.ag(string2);
            String str2 = xwqVar.e;
            if (str2 == null) {
                string3 = null;
            }
            String ag3 = albo.ag(string3);
            String ag4 = albo.ag(str2);
            String ag5 = albo.ag(str);
            String str3 = xwqVar.i;
            if (str3 == null) {
                str3 = xwqVar.l;
            }
            return resources2.getString(i6, ag, ag2, ag3, ag4, ag5, albo.ag(str3), albo.ag(xwqVar.j), albo.ag(xwqVar.k));
        }
        if (xwqVar.b != 1) {
            int i10 = xwqVar.f;
            if (i10 == 0) {
                i4 = R.string.unsuccess_message_format;
            } else if (i10 == 1) {
                if (gh.s(xwqVar.g)) {
                    i4 = R.string.unsuccess_message_format_with_single_attachment_location;
                } else if (gh.m(xwqVar.g)) {
                    i4 = R.string.unsuccess_message_format_with_single_attachment_image;
                } else if (gh.z(xwqVar.g)) {
                    i4 = R.string.unsuccess_message_format_with_single_attachment_video;
                } else if (gh.e(xwqVar.g)) {
                    i4 = R.string.unsuccess_message_format_with_single_attachment_audio;
                } else {
                    i4 = R.string.unsuccess_message_format_with_single_attachment;
                }
            } else {
                i4 = R.string.unsuccess_message_format_with_multiple_attachments;
            }
            Resources resources3 = xwqVar.a;
            String ag6 = albo.ag(string);
            String ag7 = albo.ag(string3);
            String ag8 = albo.ag(xwqVar.e);
            String ag9 = albo.ag(str);
            String str4 = xwqVar.i;
            if (str4 == null) {
                str4 = xwqVar.l;
            }
            return resources3.getString(i4, ag6, ag7, ag8, ag9, albo.ag(str4), albo.ag(xwqVar.j), albo.ag(xwqVar.k));
        }
        if (xwqVar.d && xwqVar.c) {
            int i11 = xwqVar.f;
            if (i11 == 0) {
                i3 = R.string.success_sent_to_message_format;
            } else if (i11 == 1) {
                if (gh.s(xwqVar.g)) {
                    i3 = R.string.success_sent_to_message_format_with_single_attachment_location;
                } else if (gh.m(xwqVar.g)) {
                    i3 = R.string.success_sent_to_message_format_with_single_attachment_image;
                } else if (gh.z(xwqVar.g)) {
                    i3 = R.string.success_sent_to_message_format_with_single_attachment_video;
                } else if (gh.e(xwqVar.g)) {
                    i3 = R.string.success_sent_to_message_format_with_single_attachment_audio;
                } else {
                    i3 = R.string.success_sent_to_message_format_with_single_attachment;
                }
            } else {
                i3 = R.string.success_sent_to_message_format_with_multiple_attachments;
            }
            Resources resources4 = xwqVar.a;
            String ag10 = albo.ag(xwqVar.e);
            String ag11 = albo.ag(str);
            String str5 = xwqVar.i;
            if (str5 == null) {
                str5 = xwqVar.l;
            }
            return resources4.getString(i3, ag10, ag11, albo.ag(str5), albo.ag(xwqVar.j));
        }
        if (albo.ah(str) && albo.ah(xwqVar.i) && albo.ah(xwqVar.l)) {
            string4 = null;
        } else {
            string4 = xwqVar.a.getString(R.string.said);
        }
        int i12 = xwqVar.f;
        if (i12 == 0) {
            int i13 = xwqVar.n;
            if (i13 != 1) {
                if (i13 != 2) {
                    i = R.string.success_message_format;
                } else {
                    return xwqVar.a.getString(R.string.success_message_unspecified_sender, albo.ag(str), albo.ag(xwqVar.i), albo.ag(xwqVar.j), albo.ag(xwqVar.k));
                }
            } else {
                return xwqVar.a.getString(R.string.success_message_self_sender, albo.ag(str), albo.ag(xwqVar.i), albo.ag(xwqVar.j), albo.ag(xwqVar.k));
            }
        } else {
            int i14 = xwqVar.n;
            if (i14 != 0) {
                if (i14 == 1) {
                    if (i12 == 1) {
                        if (gh.s(xwqVar.g)) {
                            i2 = R.string.success_message_self_sender_format_with_single_attachment_location;
                        } else if (gh.m(xwqVar.g)) {
                            i2 = R.string.success_message_self_sender_format_with_single_attachment_image;
                        } else if (gh.z(xwqVar.g)) {
                            i2 = R.string.success_message_self_sender_format_with_single_attachment_video;
                        } else if (gh.e(xwqVar.g)) {
                            i2 = R.string.success_message_self_sender_format_with_single_attachment_audio;
                        } else {
                            i2 = R.string.success_message_self_sender_format_with_single_attachment;
                        }
                    } else {
                        i2 = R.string.success_message_self_sender_format_with_multiple_attachments;
                    }
                } else if (i12 == 1) {
                    if (gh.s(xwqVar.g)) {
                        i2 = R.string.success_message_unspecified_sender_format_with_single_attachment_location;
                    } else if (gh.m(xwqVar.g)) {
                        i2 = R.string.success_message_unspecified_sender_format_with_single_attachment_image;
                    } else if (gh.z(xwqVar.g)) {
                        i2 = R.string.success_message_unspecified_sender_format_with_single_attachment_video;
                    } else if (gh.e(xwqVar.g)) {
                        i2 = R.string.success_message_unspecified_sender_format_with_single_attachment_audio;
                    } else {
                        i2 = R.string.success_message_unspecified_sender_format_with_single_attachment;
                    }
                } else {
                    i2 = R.string.success_message_unspecified_sender_format_with_multiple_attachments;
                }
                Resources resources5 = xwqVar.a;
                String ag12 = albo.ag(string4);
                String ag13 = albo.ag(str);
                String str6 = xwqVar.i;
                if (str6 == null) {
                    str6 = xwqVar.l;
                }
                return resources5.getString(i2, ag12, ag13, albo.ag(str6), albo.ag(xwqVar.j), albo.ag(xwqVar.k));
            }
            if (i12 == 1) {
                if (gh.s(xwqVar.g)) {
                    i = R.string.success_message_specified_sender_format_with_single_attachment_location;
                } else if (gh.m(xwqVar.g)) {
                    i = R.string.success_message_specified_sender_format_with_single_attachment_image;
                } else if (gh.z(xwqVar.g)) {
                    i = R.string.success_message_specified_sender_format_with_single_attachment_video;
                } else if (gh.e(xwqVar.g)) {
                    i = R.string.success_message_specified_sender_format_with_single_attachment_audio;
                } else {
                    i = R.string.success_message_specified_sender_format_with_single_attachment;
                }
            } else {
                i = R.string.success_message_specified_sender_format_with_multiple_attachments;
            }
        }
        Resources resources6 = xwqVar.a;
        String ag14 = albo.ag(xwqVar.e);
        String ag15 = albo.ag(string4);
        String ag16 = albo.ag(str);
        String str7 = xwqVar.i;
        if (str7 == null) {
            str7 = xwqVar.l;
        }
        return resources6.getString(i, ag14, ag15, ag16, albo.ag(str7), albo.ag(xwqVar.j), albo.ag(xwqVar.k));
    }
}
