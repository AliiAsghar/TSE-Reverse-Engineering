package com.google.android.libraries.abuse.hades.tartarus.runtime;

import com.google.android.apps.common.proguard.UsedByNative;
import defpackage.aqil;
import defpackage.arsd;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class Data {
    private final LinkedHashMap a = new LinkedHashMap();

    private final void a(StringBuilder sb, List list, int i) {
        for (Object obj : list) {
            sb.append(arsd.w("  ", i));
            if (obj instanceof Data) {
                sb.append("{\n");
                ((Data) obj).b(sb, i + 1);
                arsd.t(sb, arsd.w("  ", i), "}\n");
            } else if (obj instanceof List) {
                sb.append("[\n");
                a(sb, (List) obj, i + 1);
                arsd.t(sb, arsd.w("  ", i), "]\n");
            } else {
                Objects.toString(obj);
                sb.append(String.valueOf(obj).concat("\n"));
            }
        }
    }

    private final void b(StringBuilder sb, int i) {
        for (Map.Entry entry : this.a.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            sb.append(arsd.w("  ", i));
            if (value instanceof Data) {
                sb.append(String.valueOf(str).concat(" = {\n"));
                ((Data) value).b(sb, i + 1);
                arsd.t(sb, arsd.w("  ", i), "}\n");
            } else if (value instanceof List) {
                sb.append(String.valueOf(str).concat(" = [\n"));
                a(sb, (List) value, i + 1);
                arsd.t(sb, arsd.w("  ", i), "]\n");
            } else {
                sb.append(str + " = " + value + "\n");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Data) {
            return this.a.equals(((Data) obj).a);
        }
        return false;
    }

    @UsedByNative
    public final boolean getBoolean(String str) {
        str.getClass();
        Object obj = this.a.get(str);
        obj.getClass();
        return ((Boolean) obj).booleanValue();
    }

    @UsedByNative
    public final ByteBuffer getBuffer(String str) {
        str.getClass();
        Object obj = this.a.get(str);
        if (obj instanceof ByteBuffer) {
            return (ByteBuffer) obj;
        }
        return null;
    }

    @UsedByNative
    public final Data getData(String str) {
        str.getClass();
        Object obj = this.a.get(str);
        obj.getClass();
        return (Data) obj;
    }

    @UsedByNative
    public final double getDouble(String str) {
        str.getClass();
        Object obj = this.a.get(str);
        obj.getClass();
        return ((Double) obj).doubleValue();
    }

    @UsedByNative
    public final long getInteger(String str) {
        str.getClass();
        Object obj = this.a.get(str);
        obj.getClass();
        return ((Long) obj).longValue();
    }

    @UsedByNative
    public final List<?> getList(String str) {
        str.getClass();
        return (List) this.a.get(str);
    }

    @UsedByNative
    public final String getNullableString(String str) {
        str.getClass();
        return (String) this.a.get(str);
    }

    @UsedByNative
    public final String getString(String str) {
        str.getClass();
        Object obj = this.a.get(str);
        obj.getClass();
        return (String) obj;
    }

    @UsedByNative
    public final boolean hasKey(String str) {
        str.getClass();
        return this.a.keySet().contains(str);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @UsedByNative
    public final boolean isBoolean(String str) {
        str.getClass();
        return this.a.get(str) instanceof Boolean;
    }

    @UsedByNative
    public final boolean isBuffer(String str) {
        str.getClass();
        return this.a.get(str) instanceof ByteBuffer;
    }

    @UsedByNative
    public final boolean isData(String str) {
        str.getClass();
        return this.a.get(str) instanceof Data;
    }

    @UsedByNative
    public final boolean isDouble(String str) {
        str.getClass();
        return this.a.get(str) instanceof Double;
    }

    @UsedByNative
    public final boolean isInteger(String str) {
        str.getClass();
        return this.a.get(str) instanceof Long;
    }

    @UsedByNative
    public final boolean isList(String str) {
        str.getClass();
        return this.a.get(str) instanceof List;
    }

    @UsedByNative
    public final boolean isString(String str) {
        str.getClass();
        return this.a.get(str) instanceof String;
    }

    @UsedByNative
    public final String keyAt(int i) {
        Set keySet = this.a.keySet();
        keySet.getClass();
        String str = (String) aqil.n(keySet.toArray(new String[0]), i);
        if (str == null) {
            return "";
        }
        return str;
    }

    @UsedByNative
    public final void putBoolean(String str, boolean z) {
        str.getClass();
        this.a.put(str, Boolean.valueOf(z));
    }

    @UsedByNative
    public final void putBuffer(String str, ByteBuffer byteBuffer) {
        str.getClass();
        byteBuffer.getClass();
        if (byteBuffer.isDirect()) {
            this.a.put(str, byteBuffer);
            return;
        }
        throw new IllegalArgumentException("Tartarus can only accept direct ByteBuffers.");
    }

    @UsedByNative
    public final void putData(String str, Data data) {
        str.getClass();
        data.getClass();
        this.a.put(str, data);
    }

    @UsedByNative
    public final void putDouble(String str, double d) {
        str.getClass();
        this.a.put(str, Double.valueOf(d));
    }

    @UsedByNative
    public final void putInteger(String str, long j) {
        str.getClass();
        this.a.put(str, Long.valueOf(j));
    }

    @UsedByNative
    public final void putList(String str, List<?> list) {
        str.getClass();
        list.getClass();
        this.a.put(str, list);
    }

    @UsedByNative
    public final void putString(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a.put(str, str2);
    }

    @UsedByNative
    public final int size() {
        return this.a.size();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        b(sb, 0);
        return sb.toString();
    }
}
