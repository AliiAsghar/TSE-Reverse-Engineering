package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vxl {
    public static final Pattern a = Pattern.compile("^(.*)-(\\+?\\d{3,20})-([^\\u001f@]+)@rcs.google.com$");
    public static final Pattern b = Pattern.compile("^(.*)\u001f(\\+?\\d{3,20})\u001f([^\\u001f@]+)@rcs.google.com$");
}
