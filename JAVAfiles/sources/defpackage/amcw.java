package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class amcw {
    private static final Map a = new HashMap();

    private amcw() {
    }

    public static synchronized String a(String str) {
        InputStream systemResourceAsStream;
        String str2;
        synchronized (amcw.class) {
            String str3 = (String) a.get(str);
            if (str3 != null) {
                return str3;
            }
            if (amcw.class.getClassLoader() != null) {
                systemResourceAsStream = amcw.class.getClassLoader().getResourceAsStream(str);
            } else {
                systemResourceAsStream = ClassLoader.getSystemResourceAsStream(str);
            }
            if (systemResourceAsStream == null) {
                String b = b(str);
                StringBuilder sb = new StringBuilder(a.bW(str, "Couldn't find classloader resource '", "'"));
                String d = d(str, sb);
                if (d == null) {
                    String property = System.getProperty("os.name");
                    if (property.equals("Mac OS X")) {
                        str2 = ".dylib";
                    } else if (property.equals("Linux")) {
                        str2 = ".so";
                    } else {
                        throw new IllegalStateException(a.bW(property, "Don't know how to unmap library name in current platform (", ")"));
                    }
                    if (b.length() > str2.length() + 3 && b.startsWith("lib") && b.endsWith(str2)) {
                        b = b.substring(3, b.length() - str2.length());
                    }
                    d = e(b, str, sb);
                }
                if (d != null) {
                    return d;
                }
                throw new UnsatisfiedLinkError(sb.toString());
            }
            try {
                String b2 = b(str);
                String str4 = System.getProperty("java.io.tmpdir") + File.separator + System.currentTimeMillis() + "-";
                for (int i = 1; i < 10000; i++) {
                    File file = new File(str4 + i);
                    if (file.mkdirs()) {
                        try {
                            File canonicalFile = file.getCanonicalFile();
                            canonicalFile.deleteOnExit();
                            File file2 = new File(canonicalFile, b2);
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                                try {
                                    byte[] bArr = new byte[4096];
                                    while (true) {
                                        int read = systemResourceAsStream.read(bArr);
                                        if (read == -1) {
                                            fileOutputStream.close();
                                            systemResourceAsStream.close();
                                            file2.deleteOnExit();
                                            return c(str, file2);
                                        }
                                        fileOutputStream.write(bArr, 0, read);
                                    }
                                } finally {
                                }
                            } catch (Throwable th) {
                                systemResourceAsStream.close();
                                throw th;
                            }
                        } catch (IOException unused) {
                            continue;
                        }
                    }
                }
                throw new AssertionError("Failed to create any usable temp directory between " + str4 + "1 and " + str4 + "9999, where java.io.tmpdir=" + System.getProperty("java.io.tmpdir") + ")");
            } catch (IOException e) {
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError("Failed while writing input stream to temp file '" + str + "': " + e.getMessage());
                unsatisfiedLinkError.initCause(e);
                throw unsatisfiedLinkError;
            }
        }
    }

    private static String b(String str) {
        int lastIndexOf = str.lastIndexOf(47);
        if (lastIndexOf == -1) {
            return str;
        }
        return str.substring(lastIndexOf + 1);
    }

    private static String c(String str, File file) {
        String str2;
        try {
            System.load(file.getPath());
            a.put(str, file.getPath());
            return file.getPath();
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            String property = System.getProperty("sun.arch.data.model");
            if ((message.contains("ELFCLASS64") && "32".equals(property)) || (message.contains("ELFCLASS32") && "64".equals(property))) {
                String message2 = e.getMessage();
                if (true != property.equals("32")) {
                    str2 = "k8";
                } else {
                    str2 = "piii";
                }
                UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(message2 + ". If you built this binary from google3, then you need to use the flag --java_cpu=" + str2 + ".  Failure to do so may cause unpredictable and serious failures.");
                unsatisfiedLinkError.setStackTrace(e.getStackTrace());
                throw unsatisfiedLinkError;
            }
            throw e;
        }
    }

    private static String d(String str, StringBuilder sb) {
        try {
            System.load(str);
            a.put(str, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't load(" + str + "): " + e.getMessage());
            return null;
        }
    }

    private static String e(String str, String str2, StringBuilder sb) {
        try {
            System.loadLibrary(str);
            a.put(str2, str);
            return str;
        } catch (UnsatisfiedLinkError e) {
            sb.append(". Couldn't loadLibrary(" + str + "): " + e.getMessage());
            return null;
        }
    }
}
