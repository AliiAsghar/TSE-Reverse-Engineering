package defpackage;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcf {
    public static final alpt a = alpt.v("applet", "base", "embed", "math", "meta", "object", "svg", "template");
    private static final alpt b = new altx("script");
    private static final alpt c = new altx("style");
    private static final alpt d = alpt.v("area", "br", "col", "hr", "img", "input", "link", "param", "source", "track", "wbr");
    private static final alpt e;
    private static final alpt f;

    static {
        new altx("input");
        new altx("form");
        new altx("script");
        alpt.r("button", "input");
        alpt.r("button", "input");
        e = alpt.r("a", "area");
        f = alpt.v("alternate", "author", "bookmark", "canonical", "cite", "help", "icon", "license", "next", "prefetch", "dns-prefetch", "prerender", "preconnect", "preload", "prev", "search", "subresource");
        new altx("form");
        new altx("input");
        alpt.r("input", "textarea");
        alpt.u("audio", "img", "input", "source", "video");
        new altx("iframe");
    }

    public static final amce a(String str, Map map, List list) {
        StringBuilder sb = new StringBuilder("<a");
        for (Map.Entry entry : map.entrySet()) {
            sb.append(" ");
            sb.append((String) entry.getKey());
            sb.append("=\"");
            sb.append(amcc.a((String) entry.getValue()));
            sb.append("\"");
        }
        boolean contains = d.contains("a");
        sb.append(">");
        if (!contains) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
            }
            sb.append("</a>");
        }
        return new amce(sb.toString());
    }

    public static final void b(String str, String str2, List list) {
        Iterator it = Arrays.asList(alzz.f(str)).iterator();
        albo.X(!d.contains("a"), "Element \"%s\" is a void element and so cannot have content.", "a");
        albo.X(!b.contains("a"), "Element \"%s\" requires SafeScript contents, not SafeHTML or text.", "a");
        albo.X(true ^ c.contains("a"), "Element \"%s\" requires SafeStyleSheet contents, not SafeHTML or text.", "a");
        while (it.hasNext()) {
            list.add(((amce) it.next()).a);
        }
    }

    public static final void c(amcg amcgVar, String str, Map map) {
        alpt alptVar = e;
        if (alptVar.contains("a")) {
            map.put("href", aotl.m(amcgVar.b));
            return;
        }
        throw new IllegalArgumentException("Attribute \"href\" with a SafeUrl value can only be used by one of the following elements: ".concat(String.valueOf(String.valueOf(alptVar))));
    }
}
