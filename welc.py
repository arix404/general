import tkinter as tk


root = tk.Tk()
root.title("WELCOME TO HELP DESK1!")
root.geometry("500x500")

# Create a simple label and entry
tk.Label(root, text="WELCOME TO HELP DESK!:",fg="pink",font=("Times New Roman",16,"bold"),bg="black").pack(pady=5)

tk.Label(root,text="Enter your name:",fg="blue").pack(pady=10)
name_entry = tk.Entry(root)
name_entry.pack(pady=5)

tk.Checkbutton(root,text="hardware issue",fg="yellow").pack(pady=5)
tk.Checkbutton(root,text="software issue",fg="purple").pack(pady=5)
tk.Checkbutton(root,text="com issue",fg="green").pack(pady=5)
tk.Checkbutton(root,text="other issue",fg="orange").pack(pady=5)


issue=tk.StringVar()
tk.Radiobutton(root,text="user",variable=issue,value="user").pack(pady=5)
tk.Radiobutton(root,text="new",variable=issue,value="new").pack(pady=5)
tk.Radiobutton(root,text="not interested",variable=issue,value="NO").pack(pady=5)

# Function to handle submit
def submit():
    
    tk.Label(root, text="Form submitted successfully!", fg="green").pack(pady=10)

# Submit button
tk.Button(root, text="Submit", command=submit).pack(pady=10)

root.mainloop()
